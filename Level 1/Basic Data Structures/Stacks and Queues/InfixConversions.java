import java.io.*;
import java.util.*;

public class InfixConversions {
    public static int precedence(char ch){
        if(ch=='+' || ch=='-')return 1;
        return 2;
}

public static void prefix(String exp){
    Stack<Character> op=new Stack<>();
    Stack<String> pre=new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(Character.isLetter(ch)){
            pre.push(String.valueOf(ch));
        }else if(ch=='('){
            op.push(ch);
        }
        else if(ch==')'){
            while(op.peek()!='('){
                String v2=pre.pop();
                String v1=pre.pop();
                char oper=op.pop();
                pre.push(String.valueOf(oper)+v1+v2);        
            }
            op.pop();
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            while(!op.isEmpty() && op.peek()!='(' && precedence(op.peek())>=precedence(ch)){
                String v2=pre.pop();
                String v1=pre.pop();
                char oper=op.pop();
                pre.push(String.valueOf(oper)+v1+v2);    
            }
            op.push(ch);
        }
    }
    while(!op.isEmpty()){
        String v2=pre.pop();
        String v1=pre.pop();
        char oper=op.pop();
        pre.push(String.valueOf(oper)+v1+v2);
    }
    System.out.println(pre.peek());
}
public static void postfix(String exp){
    Stack<Character> op=new Stack<>();
    Stack<String> post=new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(Character.isLetter(ch)){
            post.push(String.valueOf(ch));
        }else if(ch=='('){
            op.push(ch);
        }
        else if(ch==')'){
            while(op.peek()!='('){
                String v2=post.pop();
                String v1=post.pop();
                char oper=op.pop();
                post.push(v1+v2+String.valueOf(oper));
            }
            op.pop();
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            while(!op.isEmpty() && op.peek()!='(' && precedence(op.peek())>=precedence(ch)){
                String v2=post.pop();
                String v1=post.pop();
                char oper=op.pop();
                post.push(v1+v2+String.valueOf(oper));
            }
            op.push(ch);
        }
    }
    while(!op.isEmpty()){
        String v2=post.pop();
        String v1=post.pop();
        char oper=op.pop();
        post.push(v1+v2+String.valueOf(oper));
    }
    System.out.println(post.peek());
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    postfix(exp);
    prefix(exp);
 }
}
