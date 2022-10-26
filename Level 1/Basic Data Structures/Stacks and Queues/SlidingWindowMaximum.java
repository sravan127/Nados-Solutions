import java.io.*;
import java.util.*;

public class SlidingWindowMaximum {
    public static int[] leftGreatest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] index=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[st.peek()]<=arr[i])st.pop();
           if(st.isEmpty())index[i]=-1;
           else index[i]=st.peek();
              st.push(i);
           }
           return index;
        }
     public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
         int n = Integer.parseInt(br.readLine());
         int[] a = new int[n];
         for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
         }
         int k = Integer.parseInt(br.readLine());
     
        int[] ngl=leftGreatest(a);
        for(int i=k-1;i<a.length;i++){
           int left=i-k+1,ind=i;
           while(ngl[ind]>=left){
              ind=ngl[ind];
           }
           System.out.println(a[ind]);
        }
     
      }
}
