import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int m=s.nextInt();
         int arr[][]=new int[n][m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 arr[i][j]=s.nextInt();
             }
         }
         int top=0,left=0,bottom=n-1,right=m-1;
         while(top<=bottom && left<=right){
             //left top to bottom
             for(int i=top;i<=bottom;i++){
                 System.out.println(arr[i][left]);
             }
             left++;
             //bootom left to right
             for(int i=left;i<=right;i++){
                 System.out.println(arr[bottom][i]);
             }
             bottom--;
             //rightmost bottom  to top
             if(left<=right){
             for(int i=bottom;i>=top;i--){
                 System.out.println(arr[i][right]);
             }
             right--;
             }
             if(top<=bottom){
             for(int i=right;i>=left;i--){
                     System.out.println(arr[top][i]);
             }
             top++;
             }
         }
     }
}
