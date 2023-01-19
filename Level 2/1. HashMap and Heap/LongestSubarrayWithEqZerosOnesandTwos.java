import java.util.*;

public class LongestSubarrayWithEqZerosOnesandTwos {

    public static int solution(int[] arr) {
        int zero_one=0;
        int one_two=0;
        HashMap<String,Integer> map=new HashMap<>();
        map.put(zero_one+"&"+one_two,-1);
        int max_size=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)zero_one--;
            else if(arr[i]==1){
                zero_one++;
                one_two--;
            }
            else one_two++;

            if(map.containsKey(zero_one+"&"+one_two)){
                max_size=Math.max(max_size,i-map.get(zero_one+"&"+one_two));
            }
            else
                map.put(zero_one+"&"+one_two,i);
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
