import java.util.*;

public class BSTTwoTransactionsAllowed {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int minSoFar=arr[0];
        int mpF=0;
        int[] dp1=new int[n];
        for(int i=1;i<n;i++){
            mpF=Math.max(mpF,arr[i]-minSoFar);
            minSoFar=Math.min(minSoFar,arr[i]);
            dp1[i]=mpF;
        }

        int maxSoFar=arr[n-1];
        int mpB=0;
        int[] dp2=new int[n];
        for(int i=n-1;i>=0;i--){
            mpB=Math.max(mpB,maxSoFar-arr[i]);
            maxSoFar=Math.max(maxSoFar,arr[i]);
            dp2[i]=mpB;
        }

        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp1[i]+dp2[i]);
        }
        System.out.println(ans);

    }

}