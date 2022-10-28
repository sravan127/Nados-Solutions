import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
             int n=s.nextInt();
             int row=Integer.MIN_VALUE;
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=s.nextInt();
                 if(arr[i]>row)row=arr[i];
             }
             for(int i=row;i>=1;i--) {
                 for(int j=0;j<n;j++) {
                     if(i<=arr[j])
                         System.out.print("*\t");
                     else
                         System.out.print("\t");
                 }
                 System.out.println();
             }
      }
}
