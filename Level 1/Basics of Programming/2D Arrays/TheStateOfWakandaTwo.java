import java.util.Scanner;

public class TheStateOfWakandaTwo {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }

        for(int j=0;j<n;j++){
            int row=0,col=j;
            while(row<n && col<n){
                System.out.println(arr[row++][col++]);
            }
        }
    }
}
