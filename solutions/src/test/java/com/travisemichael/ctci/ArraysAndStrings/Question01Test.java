package com.travisemichael.ctci.ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question01Test {
  @Test
  public void isUnique0() throws Exception {
    assertTrue(Question01.isUnique0(""));
    assertTrue(Question01.isUnique0("abc"));
    assertTrue(Question01.isUnique0("abc123@$ "));
    assertTrue(Question01.isUnique0(null));
    
    assertFalse(Question01.isUnique0("abcabc"));
    assertFalse(Question01.isUnique0("  "));
    assertFalse(Question01.isUnique0("1hc3uef9@@"));
  }

  @Test
  public void isUnique1() throws Exception {
    assertTrue(Question01.isUnique1(""));
    assertTrue(Question01.isUnique1("abc"));
    assertTrue(Question01.isUnique1("abc123@$ "));
    assertTrue(Question01.isUnique1(null));

    assertFalse(Question01.isUnique1("abcabc"));
    assertFalse(Question01.isUnique1("  "));
    assertFalse(Question01.isUnique1("1hc3uef9@@"));
  }

}