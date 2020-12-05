package org.eminera.oop.lesson20.hw;

public class StudentBlock {
  public String name;

  {
    System.out.println("Non-static block called!");
  }

  public StudentBlock(String name) {
    this.name = name;
  }

  static {
    System.out.println("Static block called!");
  }
}
