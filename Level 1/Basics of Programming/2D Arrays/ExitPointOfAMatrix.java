import java.util.Scanner;

public class ExitPointOfAMatrix {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int m=s.nextInt();
         int arr[][]=new int[n][m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 arr[i][j]=s.nextInt();
             }
         }
         int i=0,j=0;
         boolean isGoingRight=true,isGoingLeft=false,isGoingDown=false,isGoingUp=false;
         while(i<n && j<m && i>=0 && j>=0){
             if(arr[i][j]==0){
                 if(isGoingRight)j++;
                 else if(isGoingLeft)j--;
                 else if(isGoingDown)i++;
                 else i--;
             }
             else if(arr[i][j]==1){
                 if(isGoingRight){
                     isGoingRight=false;
                     isGoingDown=true;
                     i++;
                 }
                 else if(isGoingLeft){
                     isGoingLeft=false;
                     isGoingUp=true;
                     i--;
                 }
                 else if(isGoingUp){
                     isGoingUp=false;
                     isGoingRight=true;
                     j++;
                 }
                 else{
                     isGoingDown=false;
                     isGoingLeft=true;
                     j--;
                 }
             }
         }
         if(isGoingRight)j--;
         else if(isGoingLeft)j++;
         else if(isGoingDown)i--;
         else i++;
         System.out.println(i);
         System.out.println(j);
         
    }
}
