import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeesUnderManager {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char root='o';
        char[] arr=new char[n];
        HashMap<Character,ArrayList<Character>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char e=scn.next().charAt(0);
            arr[i]=e;
            char m=scn.next().charAt(0);
            if(e==m){
                root=m;
                continue;
            }
            if(map.containsKey(m)){
                ArrayList<Character> t=map.get(m);
                t.add(e);
                map.put(m,t);
            }
            else{
                ArrayList<Character> t=new ArrayList<>();
                t.add(e);
                map.put(m,t);
            }
            
        }
        //System.out.println(root);
        HashMap<Character,Integer> ans=new HashMap<>();
        getSizes(root,map,ans);
        
        for(char a: ans.keySet()){
            System.out.println(a+" "+ans.get(a));
        }
        scn.close();
      }
      
      public static int getSizes(char root, HashMap<Character,ArrayList<Character>> map, HashMap<Character,Integer> ans){
          if(map.containsKey(root)==false){
              ans.put(root,0);
              return 0;
          }
          int size=0;
          for(char emp: map.get(root)){
              size+=getSizes(emp,map,ans);
          }
          size+=map.get(root).size();
          ans.put(root,size);
          return size;
      }
}

