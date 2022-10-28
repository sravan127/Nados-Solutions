import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        // write your code here  
        Scanner s=new Scanner(System.in);
           int  n=s.nextInt();
           while(n!=0) {
               int rem=n%10;
               System.out.println(rem);
               n=n/10;
           }
       }
}
