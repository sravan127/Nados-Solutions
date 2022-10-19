import java.util.Scanner;

public class GetMazePathWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr || sc>dc){
            return;
        }
        if(sc==dc && sr==dr){
            System.out.println(psf);
            return;
        }
        for(int i=0;i<=dc;i++)
            printMazePaths(sr,sc+i+1,dr,dc,psf+"h"+(i+1));
        for(int i=0;i<=dr;i++)
            printMazePaths(sr+i+1,sc,dr,dc,psf+"v"+(i+1));
        for(int i=0;i<=dr && i<=dc;i++)
            printMazePaths(sr+i+1,sc+i+1,dr,dc,psf+"d"+(i+1));
    }
}
