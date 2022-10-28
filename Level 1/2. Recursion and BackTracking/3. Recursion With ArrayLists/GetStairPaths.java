import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
}

public static ArrayList<String> getStairPaths(int n) {
     if(n==0){
        ArrayList<String> res=new ArrayList<String>();
        res.add("");
        return res;
     } 
    
    ArrayList<String> res1=new ArrayList<String>();
    ArrayList<String> res2=new ArrayList<String>();
    ArrayList<String> res3=new ArrayList<String>();
    ArrayList<String> res=new ArrayList<String>();


    if(n>=1){
         res1=getStairPaths(n-1);
         for(String s: res1){
             res.add(1+s);
         }
    }
    if(n>=2){
        res2=getStairPaths(n-2);
        for(String s: res2){
             res.add(2+s);
         }
    }

    if(n>=3){
        res3=getStairPaths(n-3);
        for(String s: res3){
             res.add(3+s);
         }
    }

    return res;
}
    
}