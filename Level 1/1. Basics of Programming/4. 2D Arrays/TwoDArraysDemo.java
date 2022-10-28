import java.util.Scanner;

public class TwoDArraysDemo {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int t=s.nextInt();
                System.out.print(t+" ");
            }
            System.out.println();
        }
}
}
