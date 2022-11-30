import java.util.*;

public class HighestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();

        HashMap<Character,Integer> hm=new HashMap<>();
        Character max=null;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int maxFr=0;
        for(Character k: hm.keySet()){
            if(hm.get(k)>maxFr){
                maxFr=hm.get(k);
                max=k;
            }
        }
        System.out.println(max);
    }

}
