import java.util.Scanner;

public class SearchInASorted2DArray {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int val=s.nextInt();
        int r=0,c=n-1;
        while(r<n && r>=0 && c<n &&c>=0){
            if(arr[r][c]<val){
                r++;
            }
            else if(arr[r][c]>val){
                c--;
            }
            else break;
        }
        if(r<n && r>=0 && c<n &&c>=0){
            System.out.println(r);
            System.out.println(c);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
