package org.eminera.lesson05;

public class ContinueApp {
  public static void main(String[] args) {
    /*
    meselenin sherti:
    1-den 100-e kimi ededleri chap edin:
      ancaq 5-e bolunen ededleri chap etmeyek.
     */

    for (int i = 1; i <= 100; i++) {
      if (i % 5 == 0) continue;
      System.out.println(i);
    }

    // 1, 2, 3, 4, 6, 7, 8, 9, 11, 12

  }
}