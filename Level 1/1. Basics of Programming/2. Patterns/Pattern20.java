import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1){
		    System.out.println("*");
		    return;
		}
		for(int i=1;i<=n;i++) {
			if(i<=n/2 || i==n) {
				System.out.print("*\t");
				for(int j=1;j<=n-2;j++)
					System.out.print("\t");
				System.out.print("*\t");
				
			}
			else {
				System.out.print("*\t");
				
				for(int j=2;j<n;j++) {
					if(i==j || i+j==n+1)
						System.out.print("*\t");
					else
						System.out.print("\t");
				}
				System.out.print("*\t");
			}
			System.out.println();
		}

    }
}
