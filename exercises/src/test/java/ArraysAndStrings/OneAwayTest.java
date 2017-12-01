package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAwayTest {
  @Test
  public void isOneAway() throws Exception {
    assertTrue(OneAway.isOneAway(null, null));
    assertTrue(OneAway.isOneAway("", "")); // empty
    assertTrue(OneAway.isOneAway("pale", "pale")); // equal

    assertTrue(OneAway.isOneAway("pale", "ple")); // delete one
    assertTrue(OneAway.isOneAway("pale", "ale")); // delete one begin
    assertTrue(OneAway.isOneAway("pale", "pal")); // delete one end

    assertTrue(OneAway.isOneAway("pale", "paile")); // add one
    assertTrue(OneAway.isOneAway("pale", "spale")); // add one begin
    assertTrue(OneAway.isOneAway("pale", "pales")); // add one end

    assertTrue(OneAway.isOneAway("pale", "bale")); // replace one

    assertFalse(OneAway.isOneAway(null, "pale"));
    assertFalse(OneAway.isOneAway("pale", null));
    assertFalse(OneAway.isOneAway("pale", "pl")); // delete two
    assertFalse(OneAway.isOneAway("pale", "palers")); // add two
    assertFalse(OneAway.isOneAway("pale", "bake")); // replace two
  }

}