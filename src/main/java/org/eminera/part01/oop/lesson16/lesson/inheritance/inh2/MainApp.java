package org.eminera.part01.oop.lesson16.lesson.inheritance.inh2;

public class MainApp {
  public static void main(String[] args) {
    Teacher elvin = new Teacher("Elvin", "abc123", 1);
    Student ismayil = new Student("Ismayil", "bcd234", 99);

    System.out.println(elvin);
    System.out.println(ismayil);
  }
}