import java.util.HashMap;

public class CountPairsSumDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        //map.put(0,0);
        long ans=0L;
        for(int val: arr){
            int rem=val%k;
            if(rem<0)rem+=k;
            if(rem!=0)
             ans+=map.getOrDefault(k-rem,0);
            else
             ans+=map.getOrDefault(0,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
     }
}
