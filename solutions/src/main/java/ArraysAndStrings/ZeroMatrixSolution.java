package ArraysAndStrings;

public class ZeroMatrixSolution {
  public static void zeroMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }

    boolean[] zeroRows = new boolean[matrix.length]; // initialized to false
    boolean[] zeroCols = new boolean[matrix[0].length]; // initialized to false

    for (int y = 0; y < matrix.length; y++) {
      for (int x = 0; x < matrix[y].length; x++) {
        if (matrix[y][x] == 0) {
          zeroRows[y] = true;
          zeroCols[x] = true;
        }
      }
    }

    zeroRows(matrix, zeroRows);
    zeroCols(matrix, zeroCols);
  }

  private static void zeroCols(int[][] matrix, boolean[] zeroCols) {
    for (int i = 0; i < zeroCols.length; i++) {
      if (zeroCols[i]) {
        for (int j = 0; j < matrix.length; j++) {
          matrix[j][i] = 0;
        }
      }
    }
  }

  private static void zeroRows(int[][] matrix, boolean[] zeroRows) {
    for (int i = 0; i < zeroRows.length; i++) {
      if (zeroRows[i]) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
