import java.util.*;

public class LongestConsecutiveSequenceOfElements{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);

    int n=s.nextInt();
    int[] arr=new int[n];

    HashMap<Integer,Boolean> hm=new HashMap<>();
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        hm.put(arr[i],true);
    }

    for(int i=0;i<n;i++){
        if(hm.containsKey(arr[i]-1))
            hm.put(arr[i],false);
    }

    int maxLen=Integer.MIN_VALUE;
    int start=n-1;
    for(int i=0;i<n;i++){
        int cnt=1;
        if(hm.get(arr[i])==true){
            while(hm.containsKey(arr[i]+cnt)){
                cnt++;
            }
        }
        int prevMax=maxLen;
        maxLen=Math.max(maxLen,cnt);
        if(cnt>prevMax){
            start=i;
        }
        else if(cnt==prevMax)
            start=Math.min(i,start);
    }
    
    int val=arr[start];
    for(int i=1;i<=maxLen;i++){
        System.out.println(val++);
    }
    s.close();
 }

}