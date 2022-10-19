import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> res=gss(str);
        System.out.println(res);
}

public static ArrayList<String> gss(String str) {
    if(str.length()==0){
        ArrayList<String> temp=new ArrayList<>();
        temp.add("");
        return temp;
    }
    char first=str.charAt(0);
    String rest=str.substring(1);
    ArrayList<String> res=gss(rest);
    ArrayList<String> fres=new ArrayList<String>();

    for(String s: res){
        fres.add(s);
    }
    for(String s: res){
        fres.add(String.valueOf(first)+s);
    }
    return fres;
}
}
