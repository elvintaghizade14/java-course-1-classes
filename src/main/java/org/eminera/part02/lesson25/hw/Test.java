package org.eminera.part02.lesson25.hw;

import java.util.ArrayList;
import java.util.List;

public class Test {
  List<Integer> list;

  public Test() {
    this.list = new ArrayList<>();
    someVoid(list);
  }

  private void someVoid(List<Integer> list) {
    list.add(0);
    list.add(1);
    list = null;
  }

  public static void main(String[] args) {
    Test test = new Test();
    System.out.println("Size is: " + test.list.size());
  }
}