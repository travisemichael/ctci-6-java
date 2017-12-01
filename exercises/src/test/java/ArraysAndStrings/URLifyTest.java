package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {
  @Test
  public void urlify() throws Exception {
    URLify.urlify(null, 0); // test does not npe
    test("", 0,"");
    test("   ", 1, "%20");
    test("Mr John Smith    ",13,"Mr%20John%20Smith");
    test("foobar", 6, "foobar");
  }


  private void test(String in, int trueLength, String out) {
    char[] inArr = in.toCharArray();
    URLify.urlify(inArr, trueLength);
    assertEquals(String.valueOf(inArr), out);
  }
}