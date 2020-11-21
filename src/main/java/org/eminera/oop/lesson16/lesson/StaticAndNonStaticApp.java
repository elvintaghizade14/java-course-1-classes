package org.eminera.oop.lesson16.lesson;

public class StaticAndNonStaticApp {
  public static void main(String[] args) {

    int anInt = getAnInt();
    short aShort =  new StaticAndNonStaticApp().getAShort();
    int anInt2 = new StaticAndNonStaticApp().getAnInt();


    System.out.println(anInt);
    System.out.println(aShort);
    System.out.println(anInt2);
  }

  static int getAnInt() {
    return (int) (Math.random() * 100); // [0, 100)
  }

  short getAShort() {
        return (short) (Math.random() * 100); // [0, 100)
  }
}
