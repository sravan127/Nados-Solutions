import java.util.*;

public class MaxSumNonAdjacentElements {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        int[] inc=new int[n];
        int[] exc=new int[n];
        
        inc[0]=arr[0];
        
        for(int i=1;i<n;i++){
            inc[i]=arr[i]+exc[i-1];
            exc[i]=Math.max(exc[i-1],inc[i-1]);
        }
        
        System.out.println(Math.max(inc[n-1],exc[n-1]));
    }
}
