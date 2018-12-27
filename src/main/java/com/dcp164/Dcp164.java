package com.dcp164;

/**
 * You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}.
 * By the pigeonhole principle, there must be a duplicate. Find it in linear time and spac\
 */

public class Dcp164 {


  public int findDuplicate(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int val = arr[Math.abs(arr[i])];
      if (val >= 0) {
        arr[Math.abs(arr[i])] *= -1;
      } else {
        return Math.abs(arr[i]);
      }
    }
    return -1;
  }
}
