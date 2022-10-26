import java.io.*;
import java.util.*;

public class InfixEvaluation {
    public static int precedence(char ch){
        if(ch=='+' || ch=='-')return 1;
        return 2;
    }
    public static int evaluate(int v1, int v2, char op){
        if(op=='+')
            return v1+v2;
        if(op=='-')
            return v1-v2;
        if(op=='*')
            return v1*v2;
        return v1/v2;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> operands=new Stack<>();
        Stack<Character> operators=new Stack<>();
    
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }
            else if(ch==')'){
                while(operators.peek()!='('){
                    char op=operators.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();
                    int res=evaluate(v1,v2,op);
                    operands.push(res);
                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(operators.size()!=0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){
                    char op=operators.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();
                    int res=evaluate(v1,v2,op);
                    operands.push(res);
                }
                operators.push(ch);
            }
        }
    
        while(operators.size()!=0){
            char op=operators.pop();
            int v2=operands.pop();
            int v1=operands.pop();
            int res=evaluate(v1,v2,op);
            operands.push(res);
        }
    
        System.out.println(operands.peek());
     }
}
