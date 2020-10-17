package org.eminera.lesson07.lesson;

import java.util.Scanner;

public class ArrayApp {
  public static void main1(String[] args) {
    int qiymet = 7;
    System.out.println(qiymet);
    System.out.println(qiymet);
    System.out.println(qiymet);
    System.out.println(qiymet);
    System.out.println(qiymet);
  }

  public static void main2(String[] args) {
    // sinifde 5 shagir var. onlari qiymetlendir!

    Scanner sc = new Scanner(System.in);
    // matrix - choxluq {1,2,3,4,5}

    for (int i = 0; i < 5; i++) {
      System.out.print("Qiymeti daxil edin: ");
      int qiymet = sc.nextInt();
      if (qiymet > 3) System.out.println("yaxshi");
      else System.out.println("pis");
    }
  }

  public static void main(String[] args) {
    // array - eyni tipde chox sayda melumatin bir yerde cemleshdirilmesi uchun

    int eded = 10;
//                   0  1  2  3  4
    int[] choxluq = {1, 2, 3, 4, 5};

    int[] ededler = new int[5]; // [...] burada 5 eded var
    ededler[0] = 1;
    ededler[1] = 2;
    ededler[2] = 3;
    ededler[3] = 4;
    ededler[4] = 5;

    System.out.println(eded);
    System.out.println(ededler);
    System.out.printf("%d -> %d -> %d -> %d -> %d\n",
            ededler[0],
            ededler[1],
            ededler[2],
            ededler[3],
            ededler[4]);

//    uzunluq         -> 5
//    sonuncu index   -> 4    -> uzunluq - 1;


    for (int index = 0; index < ededler.length; index++) {
      System.out.println((index) + "-ci eded = " + ededler[index]);
    }

  }
}