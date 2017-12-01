package ArraysAndStrings;

public class URLifySolution {
  // assumptions: array has enough room to hold additional characters; trueLength is actual length of input
  public static void urlify(char[] str, int trueLength) {
    if (str == null) {
      return;
    }
    int ptr = str.length-1;

    for (int i = trueLength-1; i >=0 && i != ptr; i--) { // i != ptr optimization to prevent noops when all spaces have been seen
      if (str[i] == ' ') {
        str[ptr--] = '0';
        str[ptr--] = '2';
        str[ptr--] = '%';
      } else {
        str[ptr--] = str[i];
      }
    }
  }
}
