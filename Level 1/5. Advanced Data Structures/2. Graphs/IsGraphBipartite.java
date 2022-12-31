import java.io.*;
import java.util.*;

public class IsGraphBipartite {
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

      //boolean[] visited=new boolean[vtces];
      int[] colors=new int[vtces];
      for(int i=0;i<vtces;i++)
         colors[i]=-1;

      for(int i=0;i<vtces;i++){
         if(colors[i]==-1){
            Queue<Integer> q=new ArrayDeque<>();
            q.add(i);
            colors[i]=0;

            while(q.size()!=0){
               int node=q.remove();
               
               for(Edge e: graph[node]){
                  if(colors[e.nbr]==-1){
                     q.add(e.nbr);
                     colors[e.nbr]=1-colors[node];
                     //System.out.println("Colored nbr of "+node+"whic is:"+e.nbr+" with "+colors[e.nbr]);
                  }
                  else if(colors[e.nbr]==colors[node]){
                     //System.out.println("Parent is "+node+" and nbr is: "+e.nbr);
                     //System.out.println(colors[node]+"  "+colors[e.nbr]);
                     System.out.println(false);
                     return;
                  }
               }
            }
         }   
      }

      System.out.println(true);      
      
   }
}