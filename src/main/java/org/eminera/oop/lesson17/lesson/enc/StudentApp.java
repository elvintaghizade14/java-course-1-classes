package org.eminera.oop.lesson17.lesson.enc;

public class StudentApp {
  public static void main1(String[] args) {
    Student elvin = new Student("pin", 21, "Elvin", "Taghizade", 93);
    // Please, get your refund!
    // Please, set your name!
    elvin.getAge();
    elvin.getPin();
    elvin.setAge(22);
    elvin.getAge();
  }

  public static void main(String[] args) {
    Student elvin = new Student("pin", 21, "Elvin", "Taghizade", 93);
    System.out.println(elvin.getAge());
//    elvin.setAge(-5);
//    System.out.println(elvin.getAge());
//    elvin.setAge(20);
//    System.out.println(elvin.getAge());

    System.out.println(elvin.getPin());
//    elvin.setPin("asnkjdna");
//    System.out.println(elvin.getPin());


    Student student2 = new Student();
    System.out.println(student2.getPin());
    student2.setPin("null chevrildi!");
    System.out.println(student2.getPin());
  }
}