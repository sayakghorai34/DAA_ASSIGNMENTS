public class NQueen {
    private static int N;
    private static int[] rows;
    private static boolean[] usedCols;
    private static boolean[] usedDiagonals;
    private static boolean[] usedReverseDiagonals;

    public static void main(String[] args) {
        N = 8;
        rows = new int[N];
        usedCols = new boolean[N];
        usedDiagonals = new boolean[2 * N - 1];
        usedReverseDiagonals = new boolean[2 * N - 1];
        solveNQueens(0);
    }
    private static void solveNQueens(int row) {
        if (row == N) {
            printBoard();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (!isCellUnderAttack(row, col)) {
                placeQueen(row, col);
                solveNQueens(row + 1);
                removeQueen(row, col);
            }
        }
    }
    private static boolean isCellUnderAttack(int row, int col) {
        return usedCols[col] || usedDiagonals[row + col] || usedReverseDiagonals[N - 1 - row + col];
    }
    private static void placeQueen(int row, int col) {
        rows[row] = col;
        usedCols[col] = true;
        usedDiagonals[row + col] = true;
        usedReverseDiagonals[N - 1 - row + col] = true;
    }
    private static void removeQueen(int row, int col) {
        rows[row] = 0;
        usedCols[col] = false;
        usedDiagonals[row + col] = false;
        usedReverseDiagonals[N - 1 - row + col] = false;
    }

    private static void printBoard() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (rows[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
