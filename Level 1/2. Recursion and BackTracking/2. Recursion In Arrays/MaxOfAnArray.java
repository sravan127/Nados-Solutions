import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        int maxm=maxOfArray(arr,0);
        System.out.println(maxm);
    }

    public static int maxOfArray(int[] arr, int idx){
         if(idx==arr.length)return -1;

         return Math.max(arr[idx],maxOfArray(arr,idx+1));
    }
}
