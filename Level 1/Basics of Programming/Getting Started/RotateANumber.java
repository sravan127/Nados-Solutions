import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        // write your code here  
        int n,k;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            k=s.nextInt();
            int temp=n;
            int nod=0;
            while(temp!=0){
                temp=temp/10;
                nod++;
            }
            k=k%nod;
            if(k<0)
              k=nod+k;
            int mul=(int)Math.pow(10,nod-k);
            int div=(int)Math.pow(10,k);
            int res=(n%div)*mul;
            res+=n/div;
            System.out.println(res);
       }
}
