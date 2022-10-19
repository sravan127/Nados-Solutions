import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int place=0;
        int new_num=0;
   
        while(n!=0){
          int digit=n%10;
          place++;
          new_num+=Math.pow(10,digit-1)*place;
          n/=10;
        }
        System.out.println(new_num);
        s.close();
    }
}
