package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTest {
  @Test
  public void zeroMatrix() throws Exception {
    test(null, null);
    test(new int[0][0], new int[0][0]);
    test(new int[][]{
            {1,0,1},
            {1,1,1},
            {0,1,1}
    }, new int[][] {
            {0,0,0},
            {0,0,1},
            {0,0,0}
    });
    test(new int[][]{
            {1,1,1,1},
            {1,1,1,1},
            {0,1,1,1}
    }, new int[][] {
            {0,1,1,1},
            {0,1,1,1},
            {0,0,0,0}
    });
  }

  private void test(int[][] in, int[][] out) {
    ZeroMatrix.zeroMatrix(in);
    assertArrayEquals(in, out);
  }
}