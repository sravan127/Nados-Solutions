import java.io.*;
import java.util.*;

public class PerfectFriends {

   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   public static void getConnectedComps(ArrayList<Edge>[] graph,int src, boolean[] visited, int[] arr){
      if(!visited[src]){
         visited[src]=true;
         arr[0]++;
         for(Edge e: graph[src]){
            getConnectedComps(graph,e.nbr,visited,arr);
         }
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      for (int i = 0; i < k; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2, 1));
         graph[v2].add(new Edge(v2, v1, 1));
      }
      
      ArrayList<Integer> comps = new ArrayList<>();
      
      boolean[] visited=new boolean[vtces];
      for(int i=0;i<vtces;i++){
         int[] arr=new int[1];
         if(!visited[i]){
            getConnectedComps(graph,i,visited,arr);
            comps.add(arr[0]);
         }
      }
      
      int ans=0;
      for(int i=0;i<comps.size();i++){
         for(int j=i+1;j<comps.size();j++){
            ans+=comps.get(i)*comps.get(j);
         }
      }
     
      System.out.println(ans);
   }

}
