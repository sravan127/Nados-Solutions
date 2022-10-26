import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreatestElementToRight {
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
    
        int[] nge = solve(a);
        display(nge);
     }
    
     public static int[] solve(int[] arr){
        int[] ans=new int[arr.length];
        ans[arr.length-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while( st.size()>0 && st.peek()<=arr[i] ){
                st.pop();
            }
            ans[i]=(st.size()==0)?-1:st.peek();
            st.push(arr[i]);
        }
        return ans;
     }
}
