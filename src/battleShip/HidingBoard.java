package battleShip;

/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;*/


public class HidingBoard {
    Ship carrier = new Ship(ModelBoat.CARRIER,5,false, new Coordonates("B1"));

     int[][] board = new int[11][11];
     boolean gameOver;
    public  int[][] initialisation() {
        int i;
        int j;
        int x;
        int y;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
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
    //public void boardDisplay(int[][] board) {
    public void boardDisplay() {
        int i;
        int j;
        System.out.println("    A   B   C   D   E   F   G   H   I   J ");
        for (i = 0; i < 10; i++) {
            System.out.print(i + "  ");
            for (j = 1; j < 11; j++) {
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
    /*public static void main(String[] args) {
        HidingBoard board = new HidingBoard();
        board.initialisation();
        //board = initialisation();
        //boardDisplay(board);
        board.boardDisplay();
    }*/
}


