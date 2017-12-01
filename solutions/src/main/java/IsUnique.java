// Question 1.1
public class IsUnique {
  public static boolean isUnique0(String str) {
    if (str == null) {
      return true;
    }

    boolean[] present = new boolean[256]; // initialized to false
    for (char c : str.toCharArray()) {
      if (present[c]) {
        return false;
      }
      present[c] = true;
    }
    return true;
  }

  // constraint: no additional data structures
  public static boolean isUnique1(String str) {
    if (str == null) {
      return true;
    }

    for (int i = 0; i < str.length()-1; i++) {
      for (int j = i+1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
}
