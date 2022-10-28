import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        ArrayList<String> res=getMazePaths(0,0,n-1,m-1);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
            return new ArrayList<String>();
        }
        if(sr==dr && sc==dc){
            ArrayList<String> ret = new ArrayList<String>();
            ret.add("");
            return ret;
        }

        ArrayList<String> res = new ArrayList<String>();

        ArrayList<String> ifRight=getMazePaths(sr,sc+1,dr,dc);
        for(String s: ifRight){
            res.add("h"+s);
        }

        ArrayList<String> ifDown=getMazePaths(sr+1,sc,dr,dc);
        for(String s: ifDown){
            res.add("v"+s);
        }

        return res;
        
    }
}
