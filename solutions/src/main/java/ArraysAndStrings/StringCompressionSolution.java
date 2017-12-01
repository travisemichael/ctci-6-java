package ArraysAndStrings;

public class StringCompressionSolution {
  public static String compressString(String str) {
    if (str == null) {
      return null;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length();) {
      char c = str.charAt(i);
      int count = 1;
      while (++i < str.length() && str.charAt(i) == c) {
        count++;
      }
      sb.append(c);
      sb.append(count);
    }

    String compressed = sb.toString();
    if (compressed.length() < str.length()) {
      return compressed;
    } else {
      return str;
    }
  }
}
