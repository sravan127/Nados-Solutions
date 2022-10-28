import java.util.Scanner;

public class TheStateOfWakandaOne {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int m1=s.nextInt();
        int a1[][]=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                a1[i][j]=s.nextInt();
            }
        }
        boolean isdown=true;
        for(int i=0;i<m1;i++){
            if(isdown){
                for(int j=0;j<n1;j++){
                    System.out.println(a1[j][i]);
                }
                isdown=false;
            }
            else{
                for(int j=n1-1;j>=0;j--){
                    System.out.println(a1[j][i]);
                }
                isdown=true;
            }
        }
     }
}
