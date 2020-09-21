package org.eminera.lesson03;

public class AssignmentOper {
  public static void main(String[] args) {
    int a = 5;
    int b = 9;
    int c = a + b; // c = 5 + 9 = 14;
    System.out.println(c);
    a = a + 1; // a = 6
    a++;       // a = 7

    System.out.println(a);

    int d = 6;
    d = d + a; // d = 6 + 7 = 13;
    d += a; // => d = d + a; 13 + 7 = 20

    System.out.println(d);

    int k = 25;
    System.out.println(k);
    int l = 4;
    k = k % l; // 25%4=1 => k = 1
    k %= l;
    System.out.println(k);
  }
}
