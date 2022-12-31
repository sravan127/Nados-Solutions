import java.util.*;

public class FractionalKnapsack {

	private static class Pair implements Comparable<Pair>{
		int wt;
		int val;
		double ratio;
		Pair(int wt,int val){
			this.wt=wt;
			this.val=val;
			this.ratio=((double)this.val/(double)this.wt*1.0);
		}
		public int compareTo(Pair p){
			if(p.ratio>this.ratio)
				return 1;
			else 
				return -1;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] val=new int[n];
        for(int i=0;i<n;i++)
            val[i]=s.nextInt();
        
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=s.nextInt();
        
        int capacity=s.nextInt();

        PriorityQueue<Pair> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++){
			pq.add(new Pair(wt[i],val[i]));
		}
		
		float profit=0;
		while(capacity!=0){
			Pair p=pq.poll();
			if(p.wt<=capacity){
				profit+=p.val;
				capacity-=p.wt;
				//System.out.println(profit);
			}
			else{
				profit+=p.ratio*capacity;
				capacity=0;
			}
		}
		 System.out.println(profit);
	}

}