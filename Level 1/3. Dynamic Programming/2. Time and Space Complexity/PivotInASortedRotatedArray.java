import java.util.*;

public class PivotInASortedRotatedArray {

  public static int findPivot(int[] arr) {
     int l=0,r=arr.length-1;
     while(l<r){
         int mid=l+(r-l)/2;
         if(arr[mid]<arr[r]){
            r=mid;
         }
         else{
             l=mid+1;
         }
     }
     return arr[l];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);

    scn.close();
  }
   
}
