package org.eminera.part01.oop.lesson20.hw;

public class BlockApp {
  public static void main(String[] args) {
    StudentBlock abc = new StudentBlock("abc");
    System.out.println(abc.name);

    StudentBlock abcd = new StudentBlock("abcd");
    System.out.println(abcd.name);

    StudentBlock abcde = new StudentBlock("abcde");
    System.out.println(abcde.name);
  }
}
