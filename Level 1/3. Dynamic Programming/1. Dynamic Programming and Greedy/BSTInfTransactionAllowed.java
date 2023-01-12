import java.util.*;

public class BSTInfTransactionAllowed {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        //int minSoFar=arr[0];
        int ans=0;
        for(int i=0;i<n-1;i++){
            //minSoFar=Math.min(minSoFar,arr[i]);
            if(arr[i]<=arr[i+1]){
                ans+=arr[i+1]-arr[i];
            }
        }

        System.out.println(ans);
    }

}