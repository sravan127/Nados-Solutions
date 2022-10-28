import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int l=1,r=n;
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=n;j++) {
	    		if(j==l || j==r)
	    			 System.out.print("*\t");
	    		else
	    			System.out.print("\t");
	    	}
	    	if(i<=n/2) {
	    	  l++;r--;
	    	}
	    	else {
	    		l--;r++;
	    	}
	    	System.out.println();
	    }

    }
}
