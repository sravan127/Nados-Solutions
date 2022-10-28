import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        StringBuilder ans=new StringBuilder("");
            int i=0;
            while(i<str.length()){
                ans.append(str.charAt(i));
                while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                    i++;
                }
                i++;
            }
            return ans.toString();
        }
    
        public static String compression2(String str){
            StringBuilder ans=new StringBuilder("");
            int i=0;
            while(i<str.length()){
                ans.append(str.charAt(i));
                int count=1;
                while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                    i++;count++;
                }
                if(count!=1)
                    ans.append(""+(count));
                i++;
            }
            return ans.toString();
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            System.out.println(compression1(str));
            System.out.println(compression2(str));
        }
}
