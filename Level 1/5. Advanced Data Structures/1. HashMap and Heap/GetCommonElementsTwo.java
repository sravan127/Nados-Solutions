import java.util.*;

public class GetCommonElementsTwo {

  public static void main(String[] args) throws Exception {
	  Scanner s=new Scanner(System.in);
    
    HashMap<Integer,Integer> hm1=new HashMap<>();
    int n1=s.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=s.nextInt();
        hm1.put(a1[i],hm1.getOrDefault(a1[i],0)+1);
    }

    HashMap<Integer,Integer> hm2=new HashMap<>();
    int n2=s.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=s.nextInt();
        hm2.put(a2[i],hm2.getOrDefault(a2[i],0)+1);
    }
    
    for(int i=0;i<n2;i++){
      if(hm1.containsKey(a2[i]) && hm2.containsKey(a2[i])){
        System.out.println(a2[i]); 
        
        hm1.put(a2[i],hm1.get(a2[i])-1);
        hm2.put(a2[i],hm2.get(a2[i])-1);
        if(hm1.get(a2[i])==0)hm1.remove(a2[i]);
        if(hm2.get(a2[i])==0)hm2.remove(a2[i]);
      }
    }

    s.close();
  }

}