package ArraysAndStrings;

// Question 1.2
public class CheckPermutationSolution {
  public static boolean isPermutation(String s1, String s2) {
    if (s1 == null && s2 == null) {
      return true;
    }
    if (s1 == null || s2 == null) {
      return false;
    }
    if (s1.length() != s2.length()) {
      return false;
    }

    int[] counts = new int[256]; // initialized to 0
    for (int i = 0; i < s1.length(); i++) {
      counts[s1.charAt(i)]++;
      counts[s2.charAt(i)]--;
    }

    for (int count : counts) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}
