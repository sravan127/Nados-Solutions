import java.io.*;
import java.util.*;

public class LargestAreaHistogram {
    public static int[] leftlowest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] index=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
           if(st.isEmpty())index[i]=-1;
           else index[i]=st.peek();
           st.push(i);
        }
        return index;
     }
     public static int[] rightlowest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] index=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
           if(st.isEmpty())index[i]=arr.length;
           else index[i]=st.peek();
           st.push(i);
        }
        Collections.reverse(Arrays.asList(index));
        return index;
     }
     
     public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
         int n = Integer.parseInt(br.readLine());
         int[] arr = new int[n];
         for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
         }
        int[] lleft=leftlowest(arr);
        int[] lright=rightlowest(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
           ans=Math.max((lright[i]-lleft[i]-1)*arr[i],ans);
        }
        System.out.println(ans);
        
      }
}
