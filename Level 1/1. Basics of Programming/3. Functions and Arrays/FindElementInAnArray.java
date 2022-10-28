import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int find=s.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==find){
                index=i;break;
            }
        }
        System.out.println(index);
          
     }
}
