import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        int ans=0;
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            while(n!=0){
                n=n/10;
                ans++;
            }
            System.out.println(ans);
            s.close();
       }
       
}
