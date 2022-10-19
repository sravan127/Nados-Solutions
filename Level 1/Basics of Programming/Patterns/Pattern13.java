import java.util.Scanner;

public class Pattern13 {
    public static int fact(int n) {
        if(n<=1)return 1;
        return n*fact(n-1);
    }
    public static int ncr(int n,int r) {
        int numerator=fact(n);
        int denominator=fact(n-r)*fact(r);
        return numerator/denominator;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ncr(i,j)+"\t");
            }
            System.out.println();
        }

    }
}
