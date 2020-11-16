package org.eminera.oop.lesson15.lesson;

public class MainApp {
  public static void main(String[] args) {
    Person person1Obj = new Person();
    person1Obj.age = 15;
    person1Obj.name = "Elvin";

    Person ismayilObj = new Person(20, "Ismayil");
    Person defaultNamePerson = new Person(1);

    System.out.println("defaultNamePerson : " + defaultNamePerson.name);

    System.out.println(person1Obj.age);    // 15
    System.out.println(person1Obj.name);   // Elvin
    System.out.println(person1Obj);
//    System.out.println(new int[3]);
//    System.out.println(new Person[5]);

    System.out.println(person1Obj.ageMult5());   // 75
    System.out.println(person1Obj.nameTwice());  // Elvin Elvin
  }
}
