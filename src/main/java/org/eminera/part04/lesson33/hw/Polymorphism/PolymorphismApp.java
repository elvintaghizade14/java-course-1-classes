package org.eminera.part04.lesson33.hw.Polymorphism;

public class PolymorphismApp {
  public static void main(String[] args) {

    // compile time
    System.out.println("a");

    // runtime
    System.out.println(10 / 0);

    // compiler + interpreter language

  }

  // compile time polymorphism => overloading
  int sum(int a) {
    return a * 2;
  }

  long sum(long a) {
    return a * 2;
  }

  // runtime polymorphism => overriding
  class Hero {
    void foo() {
      System.out.println("Super Hero");
    }
  }

  class LittleHero extends Hero {
    @Override
    void foo() {
      System.out.println("Little Hero");
    }
  }
}
