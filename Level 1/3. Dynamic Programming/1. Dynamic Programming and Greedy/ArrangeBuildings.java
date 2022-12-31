import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    long endingWith0=1;
    long endingWith1=1;
    for(int i=2;i<=n;i++){
        long t=endingWith1;
        endingWith1+=endingWith0;
        endingWith0=t;
    }

    long ways=endingWith0+endingWith1;
    System.out.println(ways*ways);
 }

}