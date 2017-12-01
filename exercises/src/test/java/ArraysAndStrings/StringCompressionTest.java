package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
  @Test
  public void compressString() throws Exception {
    assertEquals(StringCompression.compressString(null), null);
    assertEquals(StringCompression.compressString(""), "");
    assertEquals(StringCompression.compressString("abbcc"), "abbcc");
    assertEquals(StringCompression.compressString("aabcccccaaa"), "a2b1c5a3");
  }
}