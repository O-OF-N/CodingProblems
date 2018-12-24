package com.dcp162;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Trie {

  public final String text;
  public Integer count = 0;
  public final Map<String, Trie> children = new HashMap<>();
  List<String> prefixes = new ArrayList<>();


  public Trie(final String text) {this.text = text;}

  public void addToTrie(String word) {
    String[] letters = word.split("");
    add(letters, 0, this);
  }

  private void add(String[] letters, int i, Trie parent) {
    if (i >= letters.length) {
      parent.count = 1;
      return;
    }
    String letter = letters[i];
    Trie child = parent.children.get(letter);
    parent.count += 1;
    if (child == null) {
      child = new Trie(letter);
      parent.children.put(letter, child);
    }
    add(letters, i + 1, child);
  }

  List<String> getPrefixes(Trie parent, String prefix) {
    List<String> prefixes = new ArrayList<>();
    for (Trie t : parent.children.values()) {
      if (t.count > 1) {
        prefixes.addAll(getPrefixes(t, prefix.concat(t.text)));
      } else {
        prefixes.add(prefix.concat(t.text));
      }
    }
    return prefixes;
  }
}
