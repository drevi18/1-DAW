package juegos;
import java.util.Scanner;

public class Conecta4 {
    public static void main(String[] args) {
        char[][] board = new char[6][7];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                board[i][j] = ' ';
        Scanner sc = new Scanner(System.in);
        int turn = 0;
        while (true) {
            printBoard(board);
            System.out.println("Jugador " + ((turn % 2 == 0) ? "X" : "O") + ", elige una columna (0-6):");
            int col = sc.nextInt();
            if (col < 0 || col > 6) {
                System.out.println("Columna inválida. Intenta de nuevo.");
                continue;
            }
            boolean placed = false;
            for (int row = 5; row >= 0; row--) {
                if (board[row][col] == ' ') {
                    board[row][col] = (turn % 2 == 0) ? 'X' : 'O';
                    placed = true;
                    turn++;
                    break;
                }
            }
            if (!placed) {
                System.out.println("Columna llena. Intenta otra.");
                continue;
            }
            if (isWin(board)) {
                printBoard(board);
                System.out.println("¡Jugador " + ((turn % 2 == 1) ? "X" : "O") + " gana!");
                break;
            }
        }
        sc.close();
    }
    static boolean isWin(char[][] b) {
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                if (checkWin(b, i, j)) return true;
        return false;
    }
    static boolean checkWin(char[][] b, int r, int c) {
        if (b[r][c] == ' ') return false;
        int[] dr = {0, 1, 1, -1}, dc = {1, 0, 1, 1};
        for (int d = 0; d < 4; d++) {
            int count = 1;
            for (int i = 1; i < 4; i++) {
                int nr = r + dr[d] * i, nc = c + dc[d] * i;
                if (nr >= 0 && nr < 6 && nc >= 0 && nc < 7 && b[nr][nc] == b[r][c]) count++;
                else break;
            }
            if (count == 4) return true;
        }
        return false;
    }
    static void printBoard(char[][] b) {
        for (char[] row : b) {
            for (char cell : row) System.out.print("|" + cell);
            System.out.println("|");
        }
        System.out.println(" 0 1 2 3 4 5 6 ");
    }
}
