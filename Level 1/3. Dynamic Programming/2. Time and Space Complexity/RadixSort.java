import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    int exp=1;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      max=Math.max(arr[i],max);
    }

    while(exp<=max){
      countSort(arr,exp);
      exp*=10;
    }
  }

  public static void countSort(int[] arr, int exp) {
   int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++){
     if(arr[i]/exp%10<min){
       min=arr[i]/exp%10;
     }
     if(arr[i]/exp%10>max){
       max=arr[i]/exp%10;
     }
   }
   int[] freq=new int[max-min+1];
   for(int i=0;i<arr.length;i++){
    freq[arr[i]/exp%10-min]++;
   }
   freq[0]--;
   for(int i=1;i<freq.length;i++){
      freq[i]+=freq[i-1];
   }

   int[] ans=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
     int index=freq[arr[i]/exp%10-min];
     freq[arr[i]/exp%10-min]--;
     ans[index]=arr[i];
     
   }
   for(int i=0;i<arr.length;i++)
    arr[i]=ans[i];
   
   System.out.print("After sorting on " + exp + " place -> ");
   print(arr);

  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);

    scn.close();
  }

}