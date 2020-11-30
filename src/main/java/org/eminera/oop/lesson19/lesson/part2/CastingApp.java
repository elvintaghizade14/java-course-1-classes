package org.eminera.oop.lesson19.lesson.part2;

public class CastingApp {
  public static void main(String[] args) {

    Teacher elvin1 = new Teacher("Elvin", 0.1);

    // upcasting
    Person elvin2 = new Teacher("Elvin123456", 0.1);

    Person person1 = new Person("Elvin");

    // downcasting
    Teacher person2 = null;
    person2         = (Teacher) elvin2;
    System.out.println(person2);

  }
}
