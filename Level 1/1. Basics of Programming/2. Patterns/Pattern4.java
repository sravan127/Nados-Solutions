import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
       int nsp=0;
       int nst=n;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=nsp;j++)
              System.out.print("\t");
           for(int k=1;k<=nst;k++)
              System.out.print("*\t");
           nsp++;nst--;
           System.out.println();
       }

    }
}
