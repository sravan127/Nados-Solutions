import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    static String[] nums={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
            Scanner s=new Scanner(System.in);
            String str=s.next();
            ArrayList<String> res=getKPC(str);
            System.out.println(res);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");
            return temp;
        }
        char ch=str.charAt(0);
        String chars=nums[ch-'0'];
        ArrayList<String> otherchars=getKPC(str.substring(1));
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<chars.length();i++){
            for(int j=0;j<otherchars.size();j++){
                res.add(String.valueOf(chars.charAt(i))+otherchars.get(j));
            }
        }
        return res;
    }
}
