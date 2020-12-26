package org.eminera.part01.oop.lesson20.lesson.inter.example;

public interface Console {
  void print(String line);

  String readLn();

  default void printLn(String line) {
    print(line);
    print("\n");
  }
}