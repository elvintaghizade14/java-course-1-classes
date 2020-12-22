package org.eminera.oop.lesson24.faq;

import java.util.function.BiFunction;

public class LambdaApp {
  public static void main(String[] args) {

    double a = 10;
    double b = 2;

    System.out.println(doOp(a, b, (d1, d2) -> d1 + d2));
    System.out.println(doOp(a, b, (d1, d2) -> d1 - d2));
    System.out.println(doOp(a, b, (d1, d2) -> d1 * d2));
    System.out.println(doOp(a, b, (d1, d2) -> d1 / d2));
    System.out.println(doOp(a, b, (d1, d2) -> d1 % d2));
  }

  public static double doOp(double a, double b, BiFunction<Double, Double, Double> op) {
    return op.apply(a, b);
  }

}