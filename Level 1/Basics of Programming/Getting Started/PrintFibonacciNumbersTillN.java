import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            if(n>1) arr[0]=0;
            if(n>2)arr[1]=1;
            for(int i=2;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            for(int i=0;i<n;i++)
               System.out.println(arr[i]);
     }
}
