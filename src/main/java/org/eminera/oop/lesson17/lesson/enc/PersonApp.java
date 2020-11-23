package org.eminera.oop.lesson17.lesson.enc;

public class PersonApp {
  public static void main(String[] args) {
    Person elvin = new Person("abc1234", "Elvin", 21);
//    System.out.println(elvin.pin);
    System.out.println(elvin.name);
    System.out.println(elvin.age);
    System.out.println(elvin.getPin());


    /*
    sizce pin her kese aciq olmasi duzgundurmu?
    access modifiers   -> field, method, class

    1. public
    2. protected
    3. private
    4. "---"        -> default

    GETTER-SETTER
     */
  }
}