package org.eminera.oop.lesson19.lesson.part2;

public class WrapperApp {
  static boolean b;
  static Boolean wB;
  public static void main1(String[] args) {

    //    String -> 8 bayt = 64 bit

    // primitive & reference (non-primitive)
    // byte, short, int, long, float, double, char,   boolean
    //   0     0     0     0     0.0    0.0    sp    false
    // reference type default value: null

//    Integer -> int
//    Long -> long
//    Short -> short
    System.out.println(wB);
    System.out.println(b);

    boolean b = false;
    Boolean isOk = Boolean.TRUE;
  }

  public static void main(String[] args) {

    // boxing
    boolean b = false;            // primitive
    Boolean bW = (Boolean) b;     // reference

    // unboxing
    Boolean aW = Boolean.TRUE;    // reference
    boolean a = (boolean) aW;     // primitive

    // autoboxing
    boolean y = true;
    Boolean yW = y;

    // auto-unboxing - BELE IFADE YOXDUR!
    Boolean zW = Boolean.FALSE;
    boolean z = zW;

    Integer integer = 5;
  }
}
