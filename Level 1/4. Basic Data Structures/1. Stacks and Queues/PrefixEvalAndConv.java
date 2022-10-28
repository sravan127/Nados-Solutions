import java.io.*;
import java.util.*;

public class PrefixEvalAndConv {
    public static int evaluate(int v1, int v2, char op){
        if(op=='+')
            return v1+v2;
        if(op=='-')
            return v1-v2;
        if(op=='*')
            return v1*v2;
        return v1/v2;
    }
    
    public static void getValueFromPrefix(String exp){
        Stack<Integer> st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v1=st.pop();
                int v2=st.pop();
                int res=evaluate(v1,v2,ch);
                st.push(res);
            }
        }
            System.out.println(st.peek());
    }
    
    public static void prefixToInfix(String exp){
        Stack<String> st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String v1=st.pop();
                String v2=st.pop();
                st.push("("+v1+ch+v2+")");
            }
        }
        System.out.println(st.peek());
    }
    
    public static void prefixToPostfix(String exp){
        Stack<String> st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String v1=st.pop();
                String v2=st.pop();
                st.push(v1+v2+ch);
            }
        }
        System.out.println(st.peek());
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
    
        getValueFromPrefix(exp);
        prefixToInfix(exp);
        prefixToPostfix(exp);
      }
}
