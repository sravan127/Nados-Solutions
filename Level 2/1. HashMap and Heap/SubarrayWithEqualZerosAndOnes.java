import java.util.*;

public class SubarrayWithEqualZerosAndOnes {

    public static int solution(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int subarrcnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)sum-=1;
            else sum+=1;
            if(hm.containsKey(sum)){
                subarrcnt+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return subarrcnt;
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