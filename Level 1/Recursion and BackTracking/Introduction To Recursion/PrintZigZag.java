import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pzz(n);
     }
 
     public static void pzz(int n){
         if(n==0){
             return;
         }
         System.out.print(n+" ");
         pzz(n-1);
         System.out.print(n+" ");
         pzz(n-1);
         System.out.print(n+" ");
     }
}
