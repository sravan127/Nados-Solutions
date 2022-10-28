import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        } 
        if (ques.charAt(0) == '0') 
            return;
            
        String ch0 = ques.substring(0, 1);
        String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";
        printEncodings(ques.substring(1), ans + code0);
            
        if(ques.length()>=2){
            String ch01 = ques.substring(0, 2);
            String code01 = (char)('a' + (Integer.parseInt(ch01) - 1)) + "";
            if (Integer.parseInt(ch01) <= 26) {
                printEncodings(ques.substring(2), ans + code01);
            }
        }  
        
    }
}
