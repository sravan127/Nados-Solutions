import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getDifference(int b, int n1, int n2){
          int ans=0, mul=1,borrow=0;
  
          while(n2!=0){
              int r1=n1%10;
              int r2=n2%10;
              int dif=r2-r1-borrow;
              borrow=(dif<0)?1:0;
              dif=(dif<0)?b+dif:dif;
              ans=ans+dif*mul;
              mul*=10;
              n1/=10; n2/=10;
          }
          return ans;
     }
}
