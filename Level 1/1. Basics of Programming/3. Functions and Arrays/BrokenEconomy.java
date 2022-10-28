import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int l=0,r=n-1;
        int ceil=-1,floor=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>key){
                r=mid-1;
                ceil=mid;
            }
            else if(arr[mid]<key){
                l=mid+1;
                floor=mid;
            }
            else{
                floor=mid;
                ceil=mid;
                break;
            }
        }
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
     }
}
