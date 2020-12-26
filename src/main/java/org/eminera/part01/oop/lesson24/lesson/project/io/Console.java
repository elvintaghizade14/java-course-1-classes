package org.eminera.part01.oop.lesson24.lesson.project.io;

public interface Console {
  void print(String line);

  String readLn();

  default void printLn(String line) {
    print(line);
    printLn();
  }

  default void printLn() {
    print("\n");
  }
}
