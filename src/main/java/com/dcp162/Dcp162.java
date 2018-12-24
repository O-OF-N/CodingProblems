package com.dcp162;

import java.util.List;

/**
 * Problem: Given a list of words, return the shortest unique prefix of each word
 */
public class Dcp162 {
  public List<String> uniquePrefixes(String[] words) {
    Trie t = new Trie("");
    t.count = 0;
    for(String word : words) t.addToTrie(word);
    return t.getPrefixes(t,"");
  }

  //Utility function just for debugging. Not used in code.
  private void printTrie(Trie root) {
    System.out.println(root.text + "  " + root.count);
    for(Trie t : root.children.values()) {
      printTrie(t);
    }
  }
}
