package org.eminera.oop.lesson17.lesson;

public class TypeApp {
  public static void main(String[] args) {
    MyType1 myType1 = new MyType1(5);
    MyType2 myType2 = new MyType2(5);

    System.out.println(myType1);
    System.out.println(myType2);

    System.out.println(myType1.equals(myType2));
  }
}
