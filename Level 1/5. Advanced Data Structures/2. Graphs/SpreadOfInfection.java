import java.io.*;
import java.util.*;

public class SpreadOfInfection {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair{
      int val;
      int cnt;
      
      public Pair(int val, int cnt){
         this.val=val;
         this.cnt=cnt;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      Queue<Pair> q=new ArrayDeque<>();
      int cnt=1;
      boolean[] visited=new boolean[vtces];

      q.add(new Pair(src,1));
      visited[src]=true;

      while(q.size()!=0){
         Pair p=q.remove();
         if(p.cnt>=t){
            continue;
         }
         int node=p.val;
         for(Edge e: graph[node]){
            if(!visited[e.nbr]){
               cnt++;
               q.add(new Pair(e.nbr,p.cnt+1));
               visited[e.nbr]=true;
            }
         }

      }

      System.out.println(cnt);
   }

}
