import java.util.Scanner;

public class MaxMin2 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr=new int[n];
    int min1=101,min2=101,max1=0,max2=0;
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        if(arr[i]>max1)max1=arr[i];
        if(arr[i]<min1)min1=arr[i];
    }
    for(int i=0;i<n;i++){
        if(arr[i]>max2 && arr[i]<max1)max2=arr[i];
        if(arr[i]<min2 && arr[i]>min1)min2=arr[i];
    }
    System.out.println(max2+" "+min2);
  }
}
