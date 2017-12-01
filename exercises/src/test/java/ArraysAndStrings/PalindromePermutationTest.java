package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
  @Test
  public void isPalindromePermutation() throws Exception {
    assertTrue(PalindromePermutation.isPalindromePermutation(null));
    assertTrue(PalindromePermutation.isPalindromePermutation(""));
    assertTrue(PalindromePermutation.isPalindromePermutation("tactcoa"));
    assertTrue(PalindromePermutation.isPalindromePermutation("TactCoa"));
    assertTrue(PalindromePermutation.isPalindromePermutation("Tact Coa"));

    assertFalse(PalindromePermutation.isPalindromePermutation("Tact Coaa"));
  }
}