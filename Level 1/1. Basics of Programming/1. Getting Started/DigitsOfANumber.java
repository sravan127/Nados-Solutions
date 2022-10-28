import java.util.Scanner;

public class DigitsOfANumber {
    static void printDigits(long n){
        if(n==0)return;
        printDigits(n/10);
        System.out.println(n%10);
      }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        printDigits(n);
        sc.close();
     }
}
