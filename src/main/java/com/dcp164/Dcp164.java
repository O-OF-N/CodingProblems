package com.dcp164;

import java.util.Arrays;
import java.util.stream.Stream;

public class Dcp164 {


  public int findDuplicate(Integer[] arr) {
    for(int i=0;i<arr.length;i++) {
      int val = arr[Math.abs(arr[i])];
      if(val>=0) {
        arr[Math.abs(arr[i])] *=-1;
      } else return Math.abs(arr[i]);
    }
    return -1;
  }
}
