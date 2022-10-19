import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int l=(n/2)+1,r=(n/2)+1;
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=n;j++) {
                    if(j==l || j==r)
                         System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                if(i<=n/2) {
                  l--;r++;
                }
                else {
                    l++;r--;
                }
                System.out.println();
            }
     }
}
