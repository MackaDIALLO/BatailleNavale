package battleShip;

/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;*/


public class HidingBoard {

    static int[][] board = new int[11][11];
    static boolean gameOver;
    public static int[][] initialisation() {
        int i;
        int j;
        int x;
        int y;
        for (i = 0; i < 10; i = i + 1) {
            for (j = 0; j < 10; j = j + 1) {
                board[i][j] = 0;
            }
        }
        /*x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        board[x][y] = 1 - board[x][y];
        board[x][y - 1] = 1 - board[x][y - 1];
        gameOver = false;*/
        return board;
    }
    // Déclaration de la grille
    public static void boardDisplay(int[][] board) {
        int i;
        int j;
        System.out.println("    A   B   C   D   E   F   G   H   I   J ");
        for (i = 0; i < 10; i = i + 1) {
            System.out.print(i + "  ");
            for (j = 1; j < 11; j = j + 1) {
                if (board[i][j] == 0) {
                    System.out.print("|_| ");
                }
                if (board[i][j] == 2) {
                    System.out.print("* ");
                }
                if (board[i][j] == 1) {
                    System.out.print(" X  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        board = initialisation();
        boardDisplay(board);
    }
}


