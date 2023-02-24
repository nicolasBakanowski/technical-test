import java.util.Arrays;

public class MagicSquare {
    public static void main(String[] args) {
        int n = 5; 
        int[][] magicSquare = new int[n][n];

        int row = n - 1;
        int col = n / 2;
        for (int i = 1; i <= n * n; i++) {
            magicSquare[row][col] = i;
            row = (row + 1) % n;
            col = (col + 1) % n;
            if (magicSquare[row][col] != 0) {
                row = (row - 1 + n) % n;
                col = (col - 2 + n) % n;
            }
        }

        for (int[] rowArr : magicSquare) {
            System.out.println(Arrays.toString(rowArr));
        }
    }
}
