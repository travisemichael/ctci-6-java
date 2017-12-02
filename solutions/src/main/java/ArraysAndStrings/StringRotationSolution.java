package ArraysAndStrings;

public class StringRotationSolution {
  public static boolean isRotation(String s1, String s2) {
    if (s1 == null && s2 == null ) {
      return true;
    } else if (s1 == null || s2 == null) {
      return false;
    } else if (s1.length() != s2.length()) {
      return false;
    }

    String s1s1 = String.format("%s%s", s1, s1);
    return isSubstring(s1s1, s2);
  }

  private static boolean isSubstring(String str, String sub) {
    return str.contains(sub);
  }
}
