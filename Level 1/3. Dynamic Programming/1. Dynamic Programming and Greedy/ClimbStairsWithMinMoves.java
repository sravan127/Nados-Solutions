import java.util.*;

public class ClimbStairsWithMinMoves {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        Integer[] dp=new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int cnt=arr[i];
            int minm=Integer.MAX_VALUE;
            for(int j=1;j<=cnt;j++){
                if(i+j<dp.length && dp[i+j]!=null){
                    minm=Math.min(minm,dp[i+j]);
                }  
            }
            if(minm!=Integer.MAX_VALUE){
                    dp[i]=1+minm;
            }
        }

        System.out.println(dp[0]);
    }

}
