import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int times=1;int nsp=2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=(i==n)?i-1:i;j>=1;j--){
                System.out.print(j+"\t");
            }
            nsp-=2;
            System.out.println();
        }
    
     }
}
