import java.util.*;

public class TilingWithM1Tiles {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        
        if(n<m){
            System.out.println(1);
            return;
        }
        
        int[] endingWith1=new int[n+1];
        int[] endingWithM=new int[n+1];
        
        for(int i=1;i<=m;i++)
            endingWith1[i]=1;
        endingWithM[m]=1;
        
        for(int i=m+1;i<=n;i++){
            endingWith1[i]=endingWith1[i-1]+endingWithM[i-1];
            endingWithM[i]=endingWith1[i-m]+endingWithM[i-m];
        }
        
        System.out.println(endingWith1[n]+endingWithM[n]);
    }
}