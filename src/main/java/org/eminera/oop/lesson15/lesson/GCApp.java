package org.eminera.oop.lesson15.lesson;

public class GCApp {
  public static void main(String[] args) {
    // Garbage Collector
    // Zibil   Yigan

    String name = "Elvin";      // 1

    name = "ABC";               // 2

    name = "JAVA";              // 3

    System.gc();

    System.out.println(name);
  }
}