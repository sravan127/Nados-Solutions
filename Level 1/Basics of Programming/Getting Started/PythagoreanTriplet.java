import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        // write your code here 
        Scanner s=new Scanner(System.in);
                int a=s.nextInt();
                int b=s.nextInt();
                int c=s.nextInt();
                
                if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
                   System.out.println("true");
                else
                  System.out.println("false");
       }
}
