package org.eminera.lesson03;

public class Operations {
  public static void main(String[] args) {
    System.out.println(1 + 2);

    int a = 5;
    int b = 29;

    System.out.println(b + a);
    System.out.println(b - a);
    System.out.println(b * a);
    System.out.println(b / a);


    System.out.println(b % a);  // mod (modulo) qaligi tapmaq uchun istifade olunur

    int c = 7;
    System.out.println(c % 2);


    int k; // declaration
//    .
//    .
//    .
    k = 10; // initialization

    int l = 20;

    boolean flag;
    flag = true;

    boolean abc = false;


    System.out.println("=========");
    int age = 5;
    System.out.println(age);      // 5
    age = age + 1; // age = 5 + 1  = 6
    System.out.println(age);      // 6
    age++; // age = age + 1 = 7
    System.out.println(age);      // 7
    age--; // age = age - 1;
    System.out.println(age);      // 6


    // x = 5
    // 5 == 5
    System.out.println("== relations ==");
    System.out.println(5 == 5);
    System.out.println(6 == 5);
    System.out.println(6 != 4);
    System.out.println(6 != 6);
    System.out.println(7 >= 8);


    int a1 = 1; // 2, 2
    int a2 = 2; // 2, 2
    int a3 = 3; // 2, 3

    // && -> her iki teref true olanda yalniz cavab true olur
    // || -> bir eded true olsa, cavab true-dur
    // !  -> inkarliq

    System.out.println((a1 == a2) && (a1 == a3));
//                        false   &&   false => false
//                        true   &&     true => true
//                        true   &&     false => false

    System.out.println(!(a1 == a2)); // true


    // TERNARY operator
    // shert ? dogru : yalnish;

    System.out.println("====ternary====");
    System.out.println(1 == 2 ? "Beraberdir!" : "Beraber deyil!");

    boolean b1 = 5 != 5 ? true : false;
    System.out.println(b1);

    int a5 = 6 < 7 ? 1000 : 10;
    System.out.println("a5 = " + a5);
  }
}
