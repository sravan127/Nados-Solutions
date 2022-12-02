import java.util.*;

public class KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=s.nextInt();
        int col=s.nextInt();

        int[][] arr=new int[n][n];
        //boolean[][] visited=new boolean[n][n];
        dfs(arr,row,col,1);
    }

    public static void dfs(int[][] chess, int r, int c, int upcomingMove) {
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]!=0)
            return;
        
        chess[r][c]=upcomingMove++;
        if(upcomingMove==chess.length*chess.length+1){
            displayBoard(chess);
        }

        dfs(chess,r-2,c+1,upcomingMove);
        dfs(chess,r-1,c+2,upcomingMove);
        dfs(chess,r+1,c+2,upcomingMove);
        dfs(chess,r+2,c+1,upcomingMove);
        dfs(chess,r+2,c-1,upcomingMove);
        dfs(chess,r+1,c-2,upcomingMove);
        dfs(chess,r-1,c-2,upcomingMove);
        dfs(chess,r-2,c-1,upcomingMove);

        chess[r][c]=0;
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}