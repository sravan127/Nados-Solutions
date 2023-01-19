import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int max_size=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                max_size=Math.max(max_size,i-map.get(sum-k));
            }
            if(!map.containsKey(sum))map.put(sum,i);
        }
        return max_size;
    }
}
