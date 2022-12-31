import java.util.*;

public class CountBinaryStrings{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    int endingWith0=1;
    int endingWith1=1;
    for(int i=2;i<=n;i++){
        int t=endingWith1;
        endingWith1+=endingWith0;
        endingWith0=t;
    }

    System.out.println(endingWith0+endingWith1);
 }

}
