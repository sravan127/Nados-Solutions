import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int nsp=0,nst=n;
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=nsp;j++)
                    System.out.print("\t");
                for(int k=1;k<=nst;k++) {
                    if(i>1 && i<=n/2) {
                        if(k==1 || k==nst)
                            System.out.print("*\t");
                        else
                            System.out.print("\t");	
                    }
                    else
                    System.out.print("*\t");
                    
                }
                if(i<=n/2) {
                    nsp++;nst-=2;
                }
                else {
                    nst+=2;nsp--;
                }
                System.out.println();
            }
    
     }
}
