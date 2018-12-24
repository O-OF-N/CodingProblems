package com.dcp159;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Problem statement:
 *
 * Given a string, return the first recurring character in it, or null if there is no recurring
 * chracter.
 * For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

class Dcp159 {

  private Set<String> charsSoFar = new HashSet<>();

  String findFirstRecurringChar(String str) {
    for (String c : str.split("")) {
      if (charsSoFar.contains(c)) {
        return c;
      }
      charsSoFar.add(c);
    }
    return null;
  }
}
