import java.util.*;

public class GoldMine {

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
        for(int i=0;i<n;i++)
            dp[i][m-1]=arr[i][m-1];
        
        for(int j=m-2;j>=0;j--){
            for(int i=0;i<n;i++){
                int maxm=Integer.MIN_VALUE;
                if(i-1>=0 && j+1<m)
                    maxm=Math.max(maxm,arr[i][j]+dp[i-1][j+1]);
                if(j+1<m)
                    maxm=Math.max(maxm,arr[i][j]+dp[i][j+1]);
                if(i+1<n && j+1<m)
                    maxm=Math.max(maxm,arr[i][j]+dp[i+1][j+1]);
                dp[i][j]=maxm;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,dp[i][0]);
        
        System.out.println(ans);
    }

}
