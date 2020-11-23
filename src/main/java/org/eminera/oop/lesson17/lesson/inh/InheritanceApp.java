package org.eminera.oop.lesson17.lesson.inh;

public class InheritanceApp {
  public static void main(String[] args) {
    Student elvinStd = new Student("Elvin", 21, 95, 127);
    Teacher elvinTch = new Teacher("Elvin", 21, 1, "Java");

    String[] strings = new String[]{"A", "B"};
    System.out.println(strings);

    for (String s:strings) System.out.println(s);

    System.out.println(elvinStd.getClass().getSuperclass().getSuperclass());

    System.out.println(elvinStd.toString());
    System.out.println(elvinTch.toString());

    System.out.println(elvinStd);
  }
}
