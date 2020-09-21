package org.eminera.lesson03;

public class EvenOrOddApp {
  public static void main(String[] args) {
    int a = 5;
    int b = 6;

    System.out.println(a % 2 == 0 ? "Cut" : "Tek"); // a%2 = 5%2 = 1 => 1 == 0 ?
    System.out.println(b % 2 == 0 ? "Cut" : "Tek"); // b%2 = 6%2 = 0 => 0 == 0 ?
  }
}
