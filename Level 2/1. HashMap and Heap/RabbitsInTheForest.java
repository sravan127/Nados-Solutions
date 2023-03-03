import java.util.HashMap;

class RabbitsInTheForest {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: answers)
            map.put(i,map.getOrDefault(i,0)+1);
        int count=0;

        for(int key: map.keySet()){
            int val=map.get(key);
            int extra=(val%(key+1)==0)?0:1;
            int groups=extra+val/(key+1);
            count+=groups*(key+1);
        }

        return count;
    }
}