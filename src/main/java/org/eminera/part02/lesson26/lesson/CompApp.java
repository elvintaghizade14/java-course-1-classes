package org.eminera.part02.lesson26.lesson;

public class CompApp {
  public static void main(String[] args) {

    int maxValue = Integer.MAX_VALUE;
    int minValue = Integer.MIN_VALUE;

    long before = System.currentTimeMillis();
    long sum = (maxValue - (long) minValue) / 2;
    System.out.println(System.currentTimeMillis() - before);


  }
}
