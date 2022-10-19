import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
           arr[i]=s.nextInt();
       
       int num=s.nextInt();

       int index=lastIndex(arr,arr.length-1,num);

       System.out.println(index);
   }

   public static int lastIndex(int[] arr, int idx, int x){
       if(idx==0){
           return -1;
       }

       if(arr[idx]!=x)
           return lastIndex(arr,idx-1,x);
       
       return idx;
   }
}
