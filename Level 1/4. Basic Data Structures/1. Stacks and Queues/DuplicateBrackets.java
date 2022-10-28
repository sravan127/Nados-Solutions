import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static boolean checkDuplicates(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==')'){
              if(st.peek()=='(')
                 return true;
              else{
                 while(st.peek()!='('){
                    st.pop();
                 }
                 st.pop();
              }
           }
           else{
              st.push(str.charAt(i));
           }
        }
        return false;
     }
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
         System.out.println(checkDuplicates(str));
     }
}
