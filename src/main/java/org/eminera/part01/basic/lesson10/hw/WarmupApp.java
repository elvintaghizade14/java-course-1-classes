package org.eminera.part01.basic.lesson10.hw;

public class WarmupApp {
  public static void main(String[] args) {
    int x = 1;
    /*
    x = 2
    2 * 5 / 2 + 0 = 5
     */
    System.out.println(++x * 5 / x-- + --x);
  }
}
