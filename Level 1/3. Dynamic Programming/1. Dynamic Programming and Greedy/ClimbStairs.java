import java.util.*;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            if(i+1<=n)dp[i]+=dp[i+1];
            if(i+2<=n)dp[i]+=dp[i+2];
            if(i+3<=n)dp[i]+=dp[i+3];
        }
        System.out.println(dp[0]);
    }

}