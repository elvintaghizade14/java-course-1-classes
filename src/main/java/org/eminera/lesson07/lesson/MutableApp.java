package org.eminera.lesson07.lesson;

public class MutableApp {
  public static void main(String[] args) {

    // mutable - > deyishe bilen

    int a = 5;              //   5
    System.out.println(a);  //   5
    a++;      // a = a + 1  ->   6
    System.out.println(a);  //   6
    System.out.println(++a);//   7      ++a->7->print
    System.out.println(a++);//   7      a++->print->a++
    System.out.println(a);  //   8

    // immutable -> deyishile bilinmeyen
    final int thisVariableIsFinal = 3;
    System.out.println(thisVariableIsFinal);

    final double PI = 3.14;

//    2 * PI * R

    double pi = Math.PI;


  }
}
