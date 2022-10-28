import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
    
        Stack<Integer> st=new Stack<>();
        int num=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='d'){
                st.push(num++);
            }
            else{
                st.push(num++);
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
         while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
    
     }
}
