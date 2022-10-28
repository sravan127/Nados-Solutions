import java.util.Scanner;

public class GCDandLCM {
    static int gcd(int n1,int n2){
        if(n1%n2==0)
           return n2;
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
      // write your code here  
      Scanner s=new Scanner(System.in);
	      int n1=s.nextInt();
	      int n2=s.nextInt();
	      int ans=gcd(n1,n2);
	      int lcm=(n1*n2)/ans;
	      System.out.println(ans);
	      System.out.println(lcm);
     }
}
