import java.util.*;

public class PaintHouseManyColors {
    public static int findMin(int[] arr, int ind){
        int minm=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i==ind)continue;
            if(arr[i]<minm)
                minm=arr[i];
        }
        return minm;
    }

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        
        int[][] arr=new int[n][k];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        int[][] dp=new int[n][k];
        for(int i=0;i<k;i++){
            dp[0][i]=arr[0][i];
        }
        
        for(int i=1;i<n;i++){
           for(int j=0;j<k;j++){
               int minm=findMin(dp[i-1],j);
               dp[i][j]=minm+arr[i][j];
           }
        }
        
        System.out.println(findMin(dp[n-1],-1));
    }
}