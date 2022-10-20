import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        //HashSet<Integer> visited=new HashSet<>();
        int[][] chess=new int[n][n];
        printTour(chess,i,j,1);

    }
    public static void printTour(int[][] chess, int i, int j, int val){
        if(i<0 || j<0 || i>=chess.length || j>= chess.length || chess[i][j]>0){
            return;
        }
        if(val==chess.length*chess.length){
            chess[i][j]=25;
            displayBoard(chess);
            chess[i][j]=0;
            return;
        }
        chess[i][j]=val;
        printTour(chess,i-2,j+1,val+1);
        printTour(chess,i-1,j+2,val+1);
        printTour(chess,i+1,j+2,val+1);
        printTour(chess,i+2,j+1,val+1);
        printTour(chess,i+2,j-1,val+1);
        printTour(chess,i+1,j-2,val+1);
        printTour(chess,i-1,j-2,val+1);
        printTour(chess,i-2,j-1,val+1);
        chess[i][j]=0;
        
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
