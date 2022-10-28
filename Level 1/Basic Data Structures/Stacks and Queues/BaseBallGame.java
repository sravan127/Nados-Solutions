import java.io.*;
import java.util.*;

public class BaseBallGame {
    public static int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ops.length;i++){
          String str=ops[i];
          if(str.equals("+")){
            int v2=st.pop();
            int v1=st.pop();
            int v3=v1+v2;
            st.push(v1); st.push(v2); st.push(v3);
          }
          else if(str.equals("D")){
            st.push(st.peek()*2);
          }
          else if(str.equals("C")){
            st.pop();
          }
          else{
            int val=Integer.parseInt(str);
            st.push(val);
          }
        }
        while(!st.isEmpty()){
          sum+=st.pop();
        }
        return sum;
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
        int result = calPoints(read.readLine().split(" "));
        System.out.println(result);
    
      }
}
