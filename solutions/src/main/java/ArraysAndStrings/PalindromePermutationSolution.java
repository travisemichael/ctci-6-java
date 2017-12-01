package ArraysAndStrings;

public class PalindromePermutationSolution {
  // assumption: string only contains only letters and spaces
  // constraint: case insensitive
  public static boolean isPlindromePermutation(String str) {
    if (str == null) {
      return true;
    }
    int[] counts = new int[26]; // assume only letters, case insensitive

    for (char c : str.toCharArray()) {
      if (c != ' ') {
        counts[lowerCase(c)%26]++;
      }
    }

    boolean foundOdd = false; // only one odd count allowed
    for (int count : counts) {
      if (count%2 == 1) { // check is odd
        if (foundOdd) { // there is already an odd count that was found
          return false;
        }
        foundOdd = true;
      }
    }
    return true;
  }

  private static char lowerCase(char c) {
    if (c  < 'a') {
      return (char)(c + 'a' - 'A');
    } else {
      return c;
    }
  }
}
