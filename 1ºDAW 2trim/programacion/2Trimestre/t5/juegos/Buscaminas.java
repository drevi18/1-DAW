package juegos;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    static final int SIZE = 5;
    static final int MINES = 5;
    static char[][] board = new char[SIZE][SIZE];
    static boolean[][] mines = new boolean[SIZE][SIZE];
    
    public static void main(String[] args) {
        initializeBoard();
        placeMines();
        Scanner sc = new Scanner(System.in);
        int revealed = 0;
        while (revealed < (SIZE * SIZE - MINES)) {
            printBoard();
            int row = sc.nextInt(), col = sc.nextInt();
            if (mines[row][col]) {
                System.out.println("¡BOOM! Has perdido.");
                return;
            }
            board[row][col] = (char) ('0' + countMines(row, col));
            revealed++;
        }
        System.out.println("¡Felicidades! Has encontrado todas las casillas seguras.");
    }

    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '-';
    }

    static void placeMines() {
        Random rand = new Random();
        int placed = 0;
        while (placed < MINES) {
            int r = rand.nextInt(SIZE), c = rand.nextInt(SIZE);
            if (!mines[r][c]) {
                mines[r][c] = true;
                placed++;
            }
        }
    }

    static int countMines(int r, int c) {
        int count = 0;
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++) {
                int nr = r + i, nc = c + j;
                if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE && mines[nr][nc])
                    count++;
            }
        return count;
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }
}
