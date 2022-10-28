import java.io.*;

public class MergeOverlappingInterval {
    public static void sortArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][0]>arr[j][0]){
                    int temp=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=temp;
                    temp=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=temp;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }
        sortArr(arr);
        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int start=i;
            int maxend=arr[i][1];
            while(i<arr.length-1 && arr[i+1][0]<=arr[start][1]){
                maxend=Math.max(maxend,arr[i+1][1]);
                i++;
            }
            System.out.println(arr[start][0]+" "+maxend);
        }
    }
}
