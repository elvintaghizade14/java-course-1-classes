package org.eminera.oop.lesson18.lesson.recap;


import static org.eminera.oop.lesson18.lesson.recap.Gender.*;

public class StudentApp {
  public static void main(String[] args) {
    Student elvin = new Student(21, "Elvin", 0.1, MALE);
    Student ismayil = new Student(19, "Ismayil", 0.0, MALE);
    Student meleyke = new Student(22, "Meleyke", 0.0, FEMALE);
    Student other = new Student(30, "Other", 0.0, OTHER);
    System.out.println(elvin);
    System.out.println(ismayil);
    System.out.println(meleyke);
    System.out.println(other);
  }
}
