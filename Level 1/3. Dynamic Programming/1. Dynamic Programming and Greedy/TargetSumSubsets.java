import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int tar=s.nextInt();

        boolean[][] dp=new boolean[n+1][tar+1];
        dp[0][0]=true;
        for(int i=1;i<tar+1;i++)
            dp[0][i]=false;
        for(int j=1;j<n+1;j++)
            dp[j][0]=true;
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<tar+1;j++){
                if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                else if(j>=arr[i-1] && dp[i-1][j-arr[i-1]]==true){
                    dp[i][j]=true;
                }
            }
        }

        System.err.println(dp[n][tar]);
    }
}