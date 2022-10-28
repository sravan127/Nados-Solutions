import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] isVisited=new boolean[n][m];
        floodfill(arr, 0, 0, "",isVisited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] isVisited) {
        if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length 
            || maze[sr][sc]==1  || isVisited[sr][sc]){
            return;
        }
        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.println(asf);
            return;
        }
        isVisited[sr][sc]=true;
        floodfill(maze,sr-1,sc,asf+"t",isVisited);
        floodfill(maze,sr,sc-1,asf+"l",isVisited);
        floodfill(maze,sr+1,sc,asf+"d",isVisited);
        floodfill(maze,sr,sc+1,asf+"r",isVisited);
        isVisited[sr][sc]=false;
    }
}
