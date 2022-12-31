import java.util.*;

public class UnboundedKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] val=new int[n];
        for(int i=0;i<n;i++)
            val[i]=s.nextInt();
        
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=s.nextInt();
        
        int capacity=s.nextInt();

        int[][] dp=new int[n+1][capacity+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<capacity+1;j++){
                if(j<wt[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]),val[i-1]+dp[i][j-wt[i-1]]);
            }
        }

        System.out.println(dp[n][capacity]);
    }
}