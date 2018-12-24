package com.dcp160;

import com.google.common.collect.ImmutableList;
import java.util.List;

class Tree {

  final String name;
  final int value;
  ImmutableList<Tree> children;

  Tree(String name, int value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("name = " + name);
    builder.append(" value = " + value);
    if (children != null && !children.isEmpty()) {
      builder.append("[");
      for (Tree t : children) {
        builder.append("child = " + t.name + ",");
      }
      builder.append("]");
    }
    return builder.toString();
  }

  static Tree emptyTree() {
    return new Tree("", 0);
  }
}
