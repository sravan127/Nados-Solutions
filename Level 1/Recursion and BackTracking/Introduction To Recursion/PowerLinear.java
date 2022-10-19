import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)return 1;
        return x*power(x,n-1);
    }
}
