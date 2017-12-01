package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPermutationTest {
  @Test
  public void isPermutation() throws Exception {
    assertTrue(CheckPermutation.isPermutation(null, null));
    assertTrue(CheckPermutation.isPermutation("", ""));
    assertTrue(CheckPermutation.isPermutation("abc", "abc"));
    assertTrue(CheckPermutation.isPermutation("abc", "bac"));

    assertFalse(CheckPermutation.isPermutation(null, ""));
    assertFalse(CheckPermutation.isPermutation(null, "nsjkds"));
    assertFalse(CheckPermutation.isPermutation("", null));
    assertFalse(CheckPermutation.isPermutation("dniwd", null));
    assertFalse(CheckPermutation.isPermutation("abc", "aabbcc"));
    assertFalse(CheckPermutation.isPermutation("abc", "abc "));
  }
}