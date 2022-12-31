import java.util.*;

public class MinCostInMazeTaversal {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int[][] dp=new int[n][m];
        dp[n-1][m-1]=arr[n-1][m-1];
        for(int i=n-1;i>=0;i--){
            for(int j=(i==n-1)?m-2:m-1;j>=0;j--){
                int minm=Integer.MAX_VALUE;
                if(j+1<m)
                    minm=Math.min(minm,arr[i][j]+dp[i][j+1]);
                if(i+1<n)
                    minm=Math.min(minm,arr[i][j]+dp[i+1][j]);
                dp[i][j]=minm;
            }
        }
        System.out.println(dp[0][0]);
    }

}