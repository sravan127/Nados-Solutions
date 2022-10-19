import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int b1=s.nextInt();
          int b2=s.nextInt();
          int to10=getValueIndecimal(n,b1);
          int ans=getValueInBase(to10,b2);
          System.out.println(ans);
          s.close();
  
      }
      public static int getValueIndecimal(int n, int b){
            int ans=0;
            int mul=1;
            while(n!=0){
                int rem=n%10;
                ans=ans+rem*mul;
                mul=mul*b;
                n/=10;
            }
            return ans;
         }
      public static int getValueInBase(int n, int b){
             int mul=1;
             int ans=0;
             while(n!=0){
                 int rem=n%b;
                 ans+=rem*mul;
                 n/=b;
                 mul*=10;
             }
             return ans;
         }
}
