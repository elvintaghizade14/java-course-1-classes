package org.eminera.oop.lesson17.faq;

public class PersonApp {
  public static void main(String[] args) {
    Person elvin  = new Person(21, "Elvin");
    Person elvin2 =     getPerson(21, "Elvin");
  }

  public static Person getPerson(int age, String name){
    return new Person(age, name);
  }
}
