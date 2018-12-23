package dcp160;

import com.dcp160.Dcp160;
import com.dcp160.Tree;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Test;

public class Dcp160Test {

  Dcp160 dcp160 = new Dcp160();

  @Test
  public void buildTree(){
    Tree a = new Tree("a", 0);
    Tree b = new Tree("b", 3);
    Tree c = new Tree("c", 5);
    Tree d = new Tree("d", 8);
    Tree e = new Tree("e", 2);
    Tree f = new Tree("f", 4);
    Tree g = new Tree("g", 1);
    Tree h = new Tree("h", 1);
    a.children = ImmutableList.of(b,c,d);
    d.children = ImmutableList.of(e,f);
    e.children = ImmutableList.of(g,h);
    assert  dcp160.getLongestPath(a).equals("gedac");
  }

  @Test
  public void buildTree_test2(){
    Tree a = new Tree("a", 0);
    Tree b = new Tree("b", 3);
    Tree c = new Tree("c", 5);
    Tree d = new Tree("d", 8);
    Tree e = new Tree("e", 2);
    Tree f = new Tree("f", 1);
    Tree g = new Tree("g", 1);
    Tree h = new Tree("h", 1);
    a.children = ImmutableList.of(b,c,d);
    d.children = ImmutableList.of(e,f);
    e.children = ImmutableList.of(g,h);
    assert  dcp160.getLongestPath(a).equals("gedac");
  }

  @Test
  public void buildTree_notThroughRoof(){
    Tree a = new Tree("a", 0);
    Tree b = new Tree("b", -3);
    Tree c = new Tree("c", -5);
    Tree d = new Tree("d", 8);
    Tree e = new Tree("e", 2);
    Tree f = new Tree("f", 1);
    Tree g = new Tree("g", 1);
    Tree h = new Tree("h", 1);
    a.children = ImmutableList.of(b,c,d);
    d.children = ImmutableList.of(e,f);
    e.children = ImmutableList.of(g,h);
    System.out.println(dcp160.getLongestPath(a));
    //assert  dcp160.getLongestPath(a).equals("gedac");
  }

  @Test
  public void buildTree_null(){
    assert  dcp160.getLongestPath(null).equals("");
  }
}
