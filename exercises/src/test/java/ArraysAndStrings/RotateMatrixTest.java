package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {
  @Test
  public void rotateMatrix() throws Exception {
    int[][] in = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    int[][] actual = new int[][] {
            {7,4,1},
            {8,5,2},
            {9,6,3}
    };
    test(in, actual);
    test(null, null);
    test(new int[0][0], new int[0][0]);
  }

  private void test(int[][] in, int[][] out) {
    RotateMatrix.rotateMatrix(in);
    assertArrayEquals(in, out);
  }
}