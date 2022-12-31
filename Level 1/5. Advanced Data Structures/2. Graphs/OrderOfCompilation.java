import java.io.*;
import java.util.*;

public class OrderOfCompilation {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void dfs(ArrayList<Edge>[] graph, int src, Stack<Integer> st, boolean[] visited){
      visited[src]=true;

      for(Edge e: graph[src]){
         if(!visited[e.nbr]){
            dfs(graph,e.nbr,st,visited);
         }
      }

      st.push(src);
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
      }

      Stack<Integer> st=new Stack<>();
      boolean[] visited=new boolean[vtces];

      for(int i=0;i<vtces;i++){
         if(!visited[i]){
            dfs(graph,i,st,visited);
         }
      }

      while(!st.isEmpty()){
         System.out.println(st.pop());
      }
   }

}