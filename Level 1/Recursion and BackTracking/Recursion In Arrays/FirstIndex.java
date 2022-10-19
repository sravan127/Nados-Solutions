import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        int num=s.nextInt();

        int index=firstIndex(arr,0,num);

        System.out.println(index);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]!=x)
            return firstIndex(arr,idx+1,x);
        
        return idx;
    }
}
