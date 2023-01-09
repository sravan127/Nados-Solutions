import java.util.*;

public class FriendsPairing {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int[] dp=new int[n+1];
       dp[1]=1;dp[2]=2;
       
       for(int i=3;i<=n;i++)
        dp[i]=dp[i-1]+(i-1)*dp[i-2];
        
        System.out.println(dp[n]);
    }

}
