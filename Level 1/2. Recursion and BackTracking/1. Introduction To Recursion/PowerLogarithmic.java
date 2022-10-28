import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)return 1;
        int powby2= power(x,n/2);
        if(n%2==0)
            return powby2*powby2;
        return x*powby2*powby2;
       
    }
}
