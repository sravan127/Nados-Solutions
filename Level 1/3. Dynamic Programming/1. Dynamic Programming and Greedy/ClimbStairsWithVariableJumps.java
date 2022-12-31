import java.util.*;

public class ClimbStairsWithVariableJumps {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            int cnt=arr[i];
            for(int j=1;j<=cnt;j++){
                if(i+j<dp.length)
                    dp[i]+=dp[i+j];
            }
        }

        System.out.println(dp[0]);
    }

}
