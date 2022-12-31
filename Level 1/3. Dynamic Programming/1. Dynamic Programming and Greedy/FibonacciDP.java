import java.util.*;

public class FibonacciDP{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n==0){System.out.println(0);return; }
    n++;
    int arr[]=new int[n];
    arr[0]=0;arr[1]=1;
    for(int i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    System.out.println(arr[n-1]);
 }

}