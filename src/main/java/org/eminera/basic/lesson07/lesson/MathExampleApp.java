package org.eminera.basic.lesson07.lesson;

public class MathExampleApp {
  public static void main(String[] args) {
    int abs = Math.abs(-7);
    System.out.println(abs);

    double abc = -3.12384;
    double abs1 = Math.abs(abc);
    System.out.println(abs1);


    int max = Math.max(2, 3);
    System.out.println(max);

    double pow = Math.pow(2, 5);
    System.out.println(pow);

    double random = Math.random() * 100;
    System.out.println(random);

    System.out.println(Math.sqrt(64));

//    0-100

//    2^5 = 32

  }

  static int musbetEt1(int qiymet) {
    if (qiymet < 0) return qiymet * (-1);
    else return qiymet;
  }

  static int musbetEt2(int qiymet) {
    if (qiymet < 0) return -qiymet;  // unary operator
    else return qiymet;
  }

  static int musbetEt3(int qiymet) {
    return qiymet < 0 ? -qiymet : qiymet;
  }
}
