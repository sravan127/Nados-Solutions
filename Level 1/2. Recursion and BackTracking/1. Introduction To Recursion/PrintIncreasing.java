import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       printIncreasing(n);
   }

   public static void printIncreasing(int n){
       if(n==0)return;
       printIncreasing(n-1);
       System.out.println(n);
   }
}
