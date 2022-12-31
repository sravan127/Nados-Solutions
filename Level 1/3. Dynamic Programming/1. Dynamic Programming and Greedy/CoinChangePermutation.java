import java.util.*;

public class CoinChangePermutation {

    public static void main(String[] args) throws Exception {
Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        int amnt=s.nextInt();

        int[] dp=new int[amnt+1];
        dp[0]=1;

        for(int val=1;val<dp.length;val++){
            for(int i=0;i<arr.length;i++){
                if(val>=arr[i]){
                    if(dp[val-arr[i]]!=0){
                        dp[val]+=dp[val-arr[i]];
                    }
                }
            }
        }

        System.out.println(dp[amnt]);
    }
}