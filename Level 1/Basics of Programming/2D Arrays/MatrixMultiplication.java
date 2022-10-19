import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int m1=s.nextInt();
        int[][] arr1=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        int n2=s.nextInt();
        int m2=s.nextInt();
        int[][] arr2=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j]=s.nextInt();
            }
        }

        if(m1!=n2){
            System.out.println("Invalid input");
            return;
        }

        int[][]res=new int[n1][m2];

        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum=0;
                for(int k=0;k<n2;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                res[i][j]=sum;
            }
        }
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
 }

}
