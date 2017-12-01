package ArraysAndStrings;

public class OneAwaySolution {
  public static boolean isOneAway(String a, String b) {
    if (a == null && b == null) {
      return true;
    } else if (a == null || b == null) {
      return false;
    } else if (a.length() - b.length() == 1) {
      return isOneCharRemoved(a, b); // this is equivalent to oneCharAdded(b, a) if it existed
    } else if (b.length() - a.length() == 1) {
      return isOneCharRemoved(b, a);
    } else if (a.length() == b.length()) {
      return a.equals(b) || isOneCharReplaced(a, b);
    } else {
      return false;
    }
  }

  private static boolean isOneCharRemoved(String a, String b) {
    if (a.length() - b.length() != 1) { // just double checking
      return false;
    }

    char[] arr = a.toCharArray();
    char[] brr = b.toCharArray(); // great naming convention, I know
    boolean charRemoved = false;

    for (int aPtr = 0, bPtr = 0; aPtr < a.length() && bPtr < b.length(); aPtr++, bPtr++) {
      if (arr[aPtr] != brr[bPtr]) {
        if (charRemoved) {
          return false;
        }
        bPtr--;
        charRemoved = true;
      }
    }
    return true;
  }

  private static boolean isOneCharReplaced(String a, String b) {
    if (a.length() != b.length()) { // just double checking
      return false;
    }

    char[] arr = a.toCharArray();
    char[] brr = b.toCharArray();
    boolean charReplaced = false;

    for (int i = 0; i < a.length(); i++) {
      if (arr[i] != brr[i]) {
        if (charReplaced) {
          return false;
        }
        charReplaced = true;
      }
    }
    return true;
  }
}
