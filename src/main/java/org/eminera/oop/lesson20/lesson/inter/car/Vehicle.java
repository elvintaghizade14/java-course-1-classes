package org.eminera.oop.lesson20.lesson.inter.car;

public interface Vehicle {



  default void greeting() {
    System.out.println("Hello, World!");
  }

   void speedUp();  // declare
}