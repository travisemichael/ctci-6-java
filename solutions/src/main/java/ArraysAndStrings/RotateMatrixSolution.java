package ArraysAndStrings;

public class RotateMatrixSolution {
  // constraint: do it in place
  public static void rotateMatrix(int[][] matrix) {
    if (matrix == null) {
      return;
    }

    for (int y = 0; y < matrix.length; y++) {
      for (int x = y+1; x < matrix[y].length; x++) { // flip matrix over diagonal
        int temp = matrix[x][y];                     // [x,a,b]
        matrix[x][y] = matrix[y][x];                 // [a,y,c]
        matrix[y][x] = temp;                         // [b,c,z]
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length/2; j++) { // flip matrix horizontally
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[i].length-1-j];
        matrix[i][matrix[i].length-1-j] = temp;
      }
    }
  }
}
