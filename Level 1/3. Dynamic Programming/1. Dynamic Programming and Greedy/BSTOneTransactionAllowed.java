import java.util.*;

public class BSTOneTransactionAllowed{

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        int minSoFar=arr[0];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            ans=Math.max(ans,arr[i]-minSoFar);
            minSoFar=Math.min(minSoFar,arr[i]);
        }

        System.out.println(ans);
    }

}
