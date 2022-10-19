import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	    int rows=s.nextInt();
	    int a=0,b=1;
	    for(int i=1;i<=rows;i++) {
	    	for(int j=1;j<=i;j++) {
	    		
	    		System.out.print(a+"\t");
	    		int c=a+b;
	    		a=b;
		    	b=c;
	    	}
	    	
	    	System.out.println();
	    }

    }
}
