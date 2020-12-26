package org.eminera.part01.oop.lesson17.lesson;

public class MyType1 extends Object {
  int a;

  public MyType1(int a) {
    this.a = a;
  }

  public boolean equals(Object that) {
    throw new IllegalArgumentException("Kefim isteyir yoxlamiram!");
  }

  @Override
  public String toString() {
    return String.format("MyType1{a=%d}", a);
  }
}