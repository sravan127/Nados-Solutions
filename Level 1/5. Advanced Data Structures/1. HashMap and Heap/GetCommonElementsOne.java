import java.util.*;

public class GetCommonElementsOne{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    
    HashSet<Integer> hs1=new HashSet<>();
    int n1=s.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=s.nextInt();
        hs1.add(a1[i]);
    }

    HashSet<Integer> hs2=new HashSet<>();
    int n2=s.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=s.nextInt();
        hs2.add(a2[i]);
    }

    for(int i=0;i<n2;i++){
        if(hs1.contains(a2[i]) && hs2.contains(a2[i])){
            System.out.println(a2[i]);
            hs2.remove(a2[i]);
        }
    }
    s.close();
 }

}