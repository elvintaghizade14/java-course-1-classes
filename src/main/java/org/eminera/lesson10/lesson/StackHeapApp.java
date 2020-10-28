package org.eminera.lesson10.lesson;

public class StackHeapApp {
  public static void main(String[] args) {
    String s = "Salam";
    System.out.println(s);

    char c = '#';
    String l = "elvin";
    String upperElvin = l.toUpperCase();
    System.out.println(l.charAt(1));
    System.out.println(upperElvin);
    String substring = l.substring(0, 3);
    System.out.println(substring);
  }
}
