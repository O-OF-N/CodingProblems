package com.dcp162;

import static org.junit.Assert.*;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Test;

public class Dcp162Test {

  @Test
  public void testRandom() {
    Dcp162 dcp162 = new Dcp162();
    List<String> t1 = dcp162.uniquePrefixes(new String[]{ "dog", "cat", "apple", "apricot",
                                                          "fish" });
    List<String> t2 = dcp162.uniquePrefixes(new String[]{ "zebra", "dog", "duck", "dot" });
    List<String> t3 = dcp162.uniquePrefixes(new String[]{ "zebra", "dog", "duck", "dove" });
    List<String> t4 = dcp162.uniquePrefixes(new String[]{});

    assert t1.containsAll(ImmutableList.of("app", "apr", "c", "d", "f"));
    assert t2.containsAll(ImmutableList.of("du", "dot", "dog", "z"));
    assert t3.containsAll(ImmutableList.of("du", "dov", "dog", "z"));
    assert t4.size() == 0;
  }

}