package com.dcp164;

import static org.junit.Assert.*;

import org.junit.Test;

public class Dcp164Test {

  Dcp164 dcp164 = new Dcp164();

  @Test
  public void test(){
    assert dcp164.findDuplicate(new Integer[]{1,2,3,1}) == 1;
    assert dcp164.findDuplicate(new Integer[]{1,1}) == 1;
    assert dcp164.findDuplicate(new Integer[]{1,2,3,4,5,2}) == 2;
  }

}