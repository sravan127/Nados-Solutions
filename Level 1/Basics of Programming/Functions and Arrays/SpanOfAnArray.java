import java.util.Scanner;

public class SpanOfAnArray {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
        System.out.println(max-min);
      }
}
