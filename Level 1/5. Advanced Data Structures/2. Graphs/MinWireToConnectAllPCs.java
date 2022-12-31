import java.io.*;
import java.util.*;

public class MinWireToConnectAllPCs {
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

   static class Pair implements Comparable<Pair>{
      int vtx;
      int adj;
      int wt;

      public Pair(int vtx, int adj, int wt){
         this.vtx=vtx;
         this.adj=adj;
         this.wt=wt;
      }

      public int compareTo(Pair o){
         return this.wt-o.wt;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      PriorityQueue<Pair> pq=new PriorityQueue<>();
      boolean[] visited=new boolean[vtces];

      pq.add(new Pair(0,-1,0));

      while(pq.size()!=0){
         Pair p=pq.remove();
         if(visited[p.vtx]){
            continue;
         }
         visited[p.vtx]=true;
         
         if(p.adj!=-1)
            System.out.println("["+p.vtx+"-"+p.adj+"@"+p.wt+"]");

         for(Edge e: graph[p.vtx]){
            if(!visited[e.nbr]){
               pq.add(new Pair(e.nbr,p.vtx,e.wt));
            }
         }
      }
   }

}