import java.util.Scanner;

public class AnyBaseMultiplication {
    public static int tobase10(int b,int n){
        int res=0;
        int c=0;
        while(n!=0){
            int q=n%10;
            res+=(int)Math.pow(b,c)*q;
            c++;
            n/=10;
        }
        //System.out.println(res);
        return res;
    }
    
    public static int tobaseb(int b,int n){
        int mul=1;
        int res=0;
        while(n!=0){
            int rem=n%b;
            res+=mul*rem;
            mul*=10;
            n/=b;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getProduct(int b, int n1, int n2){
         int a1=tobase10(b,n1);
         int a2=tobase10(b,n2);
         int a3=a1*a2;
         int n3=tobaseb(b,a3);
         return n3;
        }
}
