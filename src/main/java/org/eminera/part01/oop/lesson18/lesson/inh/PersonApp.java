package org.eminera.part01.oop.lesson18.lesson.inh;

public class PersonApp {
  public static void main(String[] args) {

    Teacher elvin = new Teacher("Elvin", 0.1);

    Person up = new Teacher("Up", 0.2);   // upcasting

    Student impl = new Teacher("impl", 0.5);

    System.out.println(elvin);
    System.out.println(up);
    System.out.println(impl);
    System.out.println(up.getClass().getName());


    System.out.println(elvin instanceof Teacher);
    System.out.println(elvin instanceof Person);
    System.out.println("---");

    System.out.println(impl instanceof Teacher);
    System.out.println(impl instanceof Student);
    System.out.println(impl instanceof Person);
    System.out.println(impl instanceof Object);

  }
}
