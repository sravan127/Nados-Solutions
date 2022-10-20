import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        printTargetSumSubsets(arr,0,"",0,sum);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos>tar){
            return;
        }
        if(sos==tar && idx==arr.length){
            System.out.println(set+".");
            return;
        }
        else if(idx==arr.length){
            return;
        }
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }
}
