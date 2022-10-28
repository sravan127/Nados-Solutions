import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean checkBalanced(String str){
        Stack<Character> st=new Stack<>();
  
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='[' || ch=='(' || ch=='{'){
               st.push(ch);
           }
           else if(ch==']' | ch==')' || ch=='}'){
              if(st.isEmpty() || (ch==')' && st.peek()!='(') )
                 return false;
              else if(st.isEmpty() || (ch==']' && st.peek()!='[') )
                 return false;
              else if(st.isEmpty() || (ch=='}' && st.peek()!='{') )
                 return false;
              else
                 st.pop();
           }
        }
        if(!st.isEmpty())return false;
        return true;
     }
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(checkBalanced(str));
     }
}
