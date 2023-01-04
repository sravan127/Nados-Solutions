import java.util.*;

public class PaintHouse {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int[][] arr=new int[n][3];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        int rMin=arr[0][0];
        int bMin=arr[0][1];
        int gMin=arr[0][2];
        
        for(int i=1;i<n;i++){
            int r=rMin,b=bMin,g=gMin;
            rMin=Math.min(b,g)+arr[i][0];
            bMin=Math.min(r,g)+arr[i][1];
            gMin=Math.min(r,b)+arr[i][2];
        }
        
        System.out.println(Math.min(rMin,Math.min(bMin,gMin)));
    }
}