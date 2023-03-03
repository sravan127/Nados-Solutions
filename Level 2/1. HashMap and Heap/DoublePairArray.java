import java.util.Map;
import java.util.TreeMap;


public class DoublePairArray {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i: arr)
            map.put(i,map.getOrDefault(i,0)+1);
        // Arrays.sort(arr);
        for(int key: map.keySet()){
            if(map.get(key)==0)continue;
            int want=key>0?key*2:key/2;
            if((key<0 && key%2!=0) || map.get(key)>map.getOrDefault(want,0))return false;
            map.put(want,map.get(want)-map.get(key));
        }
        return true;
    }
    
}
