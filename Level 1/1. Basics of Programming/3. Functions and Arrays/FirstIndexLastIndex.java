import java.util.Scanner;

public class FirstIndexLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int l=0,r=n-1;
        int li=-1,fi=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>key)
              r=mid-1;
            else if(arr[mid]<key)
               l=mid+1;
            else{
                fi=mid;
                r=mid-1;
            }
        }
        l=0;r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>key)
              r=mid-1;
            else if(arr[mid]<key)
               l=mid+1;
            else{
                li=mid;
                l=mid+1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
     }
}
