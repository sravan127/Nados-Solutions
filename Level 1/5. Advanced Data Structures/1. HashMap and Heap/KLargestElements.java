import java.util.*;
import java.io.*;
class KLargestElements{
 	public static void main (String[] args) throws IOException
 	  {
        Scanner scn= new Scanner(System.in);
            int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
                num[i] = scn.nextInt();
            }
        int k = scn.nextInt();
        solve(n,num,k);
        scn.close();
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int val: arr)
			pq.add(val);
		while(k!=0){
			System.out.print(pq.remove()+" ");
			k--;
		}
		
     }
 }
