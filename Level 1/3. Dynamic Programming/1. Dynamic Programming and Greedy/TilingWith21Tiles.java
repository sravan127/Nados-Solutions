import java.util.*;

public class TilingWith21Tiles {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int[] endingWith1=new int[n+1];
        int[] endingWith2=new int[n+1];
        
        endingWith1[1]=1;endingWith1[2]=1;
        endingWith2[2]=1;
        
        for(int i=3;i<=n;i++){
            endingWith1[i]=endingWith1[i-1]+endingWith2[i-1];
            endingWith2[i]=endingWith1[i-2]+endingWith2[i-2];
        }
        
        System.out.println(endingWith1[n]+endingWith2[n]);
    }
}
