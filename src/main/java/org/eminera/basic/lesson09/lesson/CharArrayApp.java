package org.eminera.basic.lesson09.lesson;

public class CharArrayApp {
  public static void main(String[] args) {
    char[] chars = new char[]{'e', 'l', 'v', 'i', 'n'};
    int[] ints = new int[]{1, 2, 3};
    double[] doubles = new double[]{1, 2, 3};

    for (int i = 0; i < 5; i++) System.out.print(chars[i]);

    System.out.println("----");
    System.out.print(chars + "\n");
    System.out.println(ints);
    System.out.println(doubles);

//    byte, short, int, long, boolean, char, float, double
    String name = "elvin";
    char[] stringAsCharArray = {'e', 'l', 'v', 'i', 'n'};
    char[] nameChars = name.toCharArray();
    for (int i = 0; i < 5; i++) System.out.print(nameChars[i]);
  }
}