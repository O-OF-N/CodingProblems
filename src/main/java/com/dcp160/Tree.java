package com.dcp160;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Tree {

  public final String name;
  public final int value;
  public ImmutableList<Tree> children;

  public Tree(String name, int value) {
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

  public static Tree emptyTree() {
    return new Tree("",0);
  }
}
