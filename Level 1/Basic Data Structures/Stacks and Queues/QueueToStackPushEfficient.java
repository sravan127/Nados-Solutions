import java.io.*;
import java.util.*;

public class QueueToStackPushEfficient {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;
    
        public QueueToStackAdapter() {
          mainQ = new ArrayDeque<>();
          helperQ = new ArrayDeque<>();
        }
    
        int size() {
           return mainQ.size();
        }
    
        void push(int val) {
            mainQ.add(val);
        }
    
        int pop() {
           while(mainQ.size()!=1){
             int val=mainQ.remove();
             helperQ.add(val);
           }
           int ret=mainQ.remove();
           while(helperQ.size()!=0){
             int val=helperQ.remove();
             mainQ.add(val);
           }
           return ret;
        }
    
        int top() {
          while(mainQ.size()!=1){
            int val=mainQ.remove();
            helperQ.add(val);
          }
          int ret=mainQ.remove();
          helperQ.add(ret);
          while(helperQ.size()!=0){
            int val=helperQ.remove();
            mainQ.add(val);
          }
          return ret;
        }
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();
    
        String str = br.readLine();
        while (str.equals("quit") == false) {
          if (str.startsWith("push")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            st.push(val);
          } else if (str.startsWith("pop")) {
            int val = st.pop();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("top")) {
            int val = st.top();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("size")) {
            System.out.println(st.size());
          }
          str = br.readLine();
        }
      } 
}
