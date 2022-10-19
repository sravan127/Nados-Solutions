import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nsp=n/2;
		int nst=1;
		for(int i=1;i<=n;i++) {
			int temp=(i>n/2)?n-i+1:i;
			for(int j=1;j<=nsp;j++)
				System.out.print("\t");
			for(int k=1;k<=nst;k++) {
				if(k<=nst/2)
				System.out.print(temp++ +"\t");
				else
					System.out.print(temp-- +"\t");
			}
			if(i<=n/2) {
				nsp--;nst+=2;
			}
			else {
				nsp++;nst-=2;
			}
			System.out.println();
		}
    }
}
