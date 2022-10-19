import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=1;i<=n;i++) {
                if(i==1) {
                    for(int j=1;j<=n/2 +1;j++)
                        System.out.print("*\t");
                    for(int j=1;j<=n/2 -1;j++)
                        System.out.print("\t");
                    System.out.print("*\t");
                }
                else if(i>1 && i<=n/2) {
                    for(int j=1;j<=n/2;j++)
                        System.out.print("\t");
                    System.out.print("*\t");
                    for(int j=1;j<=n/2 -1;j++)
                        System.out.print("\t");
                    System.out.print("*\t");
                }
                else if(i==n/2+1) {
                    for(int j=1;j<=n;j++)
                        System.out.print("*\t");
                }
                else if(i>n/2 && i<n) {
                    System.out.print("*\t");
                    for(int j=1;j<=n/2 -1;j++)
                        System.out.print("\t");
                    System.out.print("*\t");
                }
                else {
                    System.out.print("*\t");
                    for(int j=1;j<=n/2 -1;j++)
                        System.out.print("\t");
                    for(int j=1;j<=n/2 +1;j++)
                        System.out.print("*\t");
                }
                System.out.println();
            }
     }
}
