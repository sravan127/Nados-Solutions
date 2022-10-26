import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int[] span = solve(a);
        display(span);
     }
    
     public static int[] solve(int[] arr){
        int[] ans=new int[arr.length];
        ans[0]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
          while(st.size()>0 && arr[st.peek()]<=arr[i] ){
            st.pop();
          }
          ans[i]=(st.size()==0)?-1:st.peek();
          st.push(i);
        }
        for(int i=0;i<ans.length;i++){
          ans[i]=i-ans[i];
        }
        return ans;
     }
}
