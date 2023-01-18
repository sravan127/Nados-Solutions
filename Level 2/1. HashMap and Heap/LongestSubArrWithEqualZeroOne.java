import java.util.*;

public class LongestSubArrWithEqualZeroOne {

    public static int solution(int[] arr) {
        int max_size=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)sum-=1;
            else sum+=1;

            if(map.containsKey(sum)){
                max_size=Math.max(i-map.get(sum),max_size);
            }
            else{
                map.put(sum,i);
            }
        }

        return max_size;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
        scn.close();
    }

}
