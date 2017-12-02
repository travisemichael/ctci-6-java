package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {
  @Test
  public void isRotation() throws Exception {
    assertTrue(StringRotation.isRotation(null, null));
    assertTrue(StringRotation.isRotation("", ""));
    assertTrue(StringRotation.isRotation("waterbottle", "waterbottle"));
    assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));

    assertFalse(StringRotation.isRotation(null, ""));
    assertFalse(StringRotation.isRotation("", null));
    assertFalse(StringRotation.isRotation("a", ""));
  }

}