import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int cols=s.nextInt();

        printMazePaths(0,0,rows-1,cols-1,"");
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

        printMazePaths(sr,sc+1,dr,dc,psf+"h");
        printMazePaths(sr+1,sc,dr,dc,psf+"v");
    }
}
