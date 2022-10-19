import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int[] minRow=new int[n];
        int[] maxCol=new int[n];

        for(int i=0;i<n;i++){
            int minval=i*n;
            for(int j=0;j<n;j++){
                if(arr[i][j]<arr[minval/n][minval%n])
                    minval=i*n+j;
            }
            minRow[i]=minval;
        }

        for(int i=0;i<n;i++){
            int maxval=i;
            for(int j=0;j<n;j++){
                //System.out.println(j+"   "+i);
                if(arr[j][i]>arr[maxval/n][maxval%n])
                    maxval=j*n+i;
            }
            maxCol[i]=maxval;
        }

        boolean isSaddlePresent=false;
        for(int i=0;i<n;i++){
            int minval=minRow[i];
            for(int j=0;j<n;j++){
                int maxval=maxCol[j];
                if(minval==maxval){
                    System.out.println(arr[minval/n][maxval%n]);
                    isSaddlePresent=true;
                    break;
                }
            }
            if(isSaddlePresent)break;
        }

        if(!isSaddlePresent){
            System.out.println("Invalid input");
        }
        
    }
}
