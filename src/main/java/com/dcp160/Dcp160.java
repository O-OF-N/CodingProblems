package com.dcp160;

import java.util.TreeSet;


/*
 Problem : Given a tree where each edge has a weight, compute the length of the longest path in the
 tree.
 */
public class Dcp160 {

  Tree longest = Tree.emptyTree();

  public String getLongestPath(final Tree tree) {
    if (tree == null) {
      return "";
    }
    getLongest(tree);
    return longest.name;
  }

  private Tree getLongest(final Tree tree) {
    if (tree == null) {
      return Tree.emptyTree();
    }
    TreeSet<Tree> trees = new TreeSet<>((t1, t2) -> t2.value - t1.value);
    if (tree.children != null) {
      for (Tree child : tree.children) {
        trees.add(getLongest(child));
      }
    }
    Tree l1 = trees.pollFirst();
    Tree l2 = trees.pollFirst();

    if (l1 == null) {
      l1 = Tree.emptyTree();
    }
    if (l2 == null) {
      l2 = Tree.emptyTree();
    }

    if (l1.value > longest.value) {
      longest = l1;
    }
    if (l1.value + tree.value > longest.value) {
      longest = new Tree(l1.name.concat(tree.name), l1.value + tree.value);
    }
    if (l1.value + l2.value + tree.value > longest.value) {
      longest =
          new Tree(l1.name.concat(tree.name).concat(l2.name), l1.value + tree.value + l2.value);
    }

    return new Tree(l1.name.concat(tree.name), l1.value + tree.value);
  }
}
