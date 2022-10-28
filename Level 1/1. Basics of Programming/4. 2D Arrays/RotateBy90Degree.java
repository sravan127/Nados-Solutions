import java.util.Scanner;

public class RotateBy90Degree {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               int temp=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<r){
               int temp=a[i][l];
               a[i][l]=a[i][r];
               a[i][r]=temp;
               l++;r--;
            }
            
        }
        display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
