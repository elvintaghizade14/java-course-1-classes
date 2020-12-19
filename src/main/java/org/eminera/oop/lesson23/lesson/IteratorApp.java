package org.eminera.oop.lesson23.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IteratorApp {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("A");
    strings.add("B");
    strings.add("C");
    strings.add("D");

    System.out.println(strings);

    for (int i = 0; i < strings.size(); i++) {
      System.out.print(strings.get(i) + " - ");
    }
    System.out.println("\n-------");
    for (String s : strings) {
      System.out.print(s + " + ");
    }
    System.out.println("\n-------");
    strings.stream().map(s -> s + " ? ").forEach(System.out::print);

  }
}