package org.eminera.part01.basic.lesson11.lesson;

//    default olaraq javada kesr ededler double olaraq tanimlanir.
//    double floating_point = 10.9;
//    float floating_point2 = 10.9f;
public class MethodOverloadingApp {
  public static void main(String[] args) {
    short s = 15;
    int a = 10;
    float f = 3.5f;
    double d = 5.5;

//    int abc;
//    double abc;

    System.out.println(vur2(s)); // short
    System.out.println(vur2(a)); // int
    System.out.println(vur2(f)); // float
    System.out.println(vur2(d)); // double
  }

  public static short vur2(short eded) {
    return (short) (eded * 2);
  }

  public static int   vur2(int eded) {
    return eded * 2;
  }

  public static float vur2(float eded) {
    return eded * 2;
  }

  public static double vur2(double eded) {
    return eded * 2;
  }
}
