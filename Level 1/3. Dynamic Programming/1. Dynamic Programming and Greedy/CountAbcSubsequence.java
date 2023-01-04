import java.util.*;

public class CountAbcSubsequence{

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        
        int a=0,ab=0,abc=0;
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'){
                a=2*a+1;
            }
            else if(c=='b'){
                ab=2*ab+a;
            }
            else{
                abc=2*abc+ab;
            }
        }
        System.out.println(abc);
    }
}