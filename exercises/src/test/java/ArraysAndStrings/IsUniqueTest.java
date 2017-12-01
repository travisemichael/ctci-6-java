package ArraysAndStrings;

import com.travisemichael.ctci.ArraysAndStrings.IsUnique;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUniqueTest {
  @Test
  public void isUnique0() throws Exception {
    assertTrue(IsUnique.isUnique0(""));
    assertTrue(IsUnique.isUnique0("abc"));
    assertTrue(IsUnique.isUnique0("abc123@$ "));
    assertTrue(IsUnique.isUnique0(null));
    
    assertFalse(IsUnique.isUnique0("abcabc"));
    assertFalse(IsUnique.isUnique0("  "));
    assertFalse(IsUnique.isUnique0("1hc3uef9@@"));
  }

  @Test
  public void isUnique1() throws Exception {
    assertTrue(IsUnique.isUnique1(""));
    assertTrue(IsUnique.isUnique1("abc"));
    assertTrue(IsUnique.isUnique1("abc123@$ "));
    assertTrue(IsUnique.isUnique1(null));

    assertFalse(IsUnique.isUnique1("abcabc"));
    assertFalse(IsUnique.isUnique1("  "));
    assertFalse(IsUnique.isUnique1("1hc3uef9@@"));
  }

}