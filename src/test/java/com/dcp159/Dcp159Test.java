package com.dcp159;

import com.dcp159.Dcp159;
import org.junit.Test;

public class Dcp159Test {

  private final Dcp159 dcp159 = new Dcp159();

  @Test
  public void findFirstRecurringChar(){
    String result = dcp159.findFirstRecurringChar("acbbac");
    assert result.equals("b");
  }

  @Test
  public void findFirstRecurringChar_noRecurring(){
    String result = dcp159.findFirstRecurringChar("abcdef");
    assert result == null;
  }

}