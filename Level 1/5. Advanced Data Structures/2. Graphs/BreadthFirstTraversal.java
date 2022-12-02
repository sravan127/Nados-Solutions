import java.io.*;
import java.util.*;

public class BreadthFirstTraversal {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair{
      int vtx;
      String psf;
      public Pair(int vtx,String psf){
         this.vtx=vtx;
         this.psf=psf;
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

      Queue<Pair> q=new ArrayDeque<>();
      boolean[] visited=new boolean[vtces];
      
      q.add(new Pair(src,""+src));
      visited[src]=true;

      while(q.size()!=0){
         Pair p=q.remove();
         System.out.println(p.vtx+"@"+p.psf);
         for(Edge e: graph[p.vtx]){
            if(!visited[e.nbr]){
               q.add(new Pair(e.nbr,p.psf+e.nbr));
               visited[e.nbr]=true;
            }
         }
      }

   }
}