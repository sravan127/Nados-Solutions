import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        displayArrInReverse(arr,0);
    }

    public static void displayArrInReverse(int[] arr, int idx){
        if(idx==arr.length)return;

        displayArrInReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
