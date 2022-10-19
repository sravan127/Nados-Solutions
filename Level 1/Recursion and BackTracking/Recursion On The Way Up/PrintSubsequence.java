import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       printSS(str,"");
       
   }

   public static void printSS(String str, String ans) {
       if(str.length()==0){
           System.out.println(ans);
           return;
       }
       String new_str=str.substring(1);
       String add=String.valueOf(str.charAt(0));
       printSS(new_str,ans+add);
       printSS(new_str,ans);
       //System.out.println(ans);

   }
}
