package org.eminera.lesson08.hw;

public class PrimeTimeTestApp {
  public static void main(String[] args) {
    final int num = 999983;

    System.out.println("test 1 ---");
    int count = 0;
    long before = System.currentTimeMillis();
    for (int i = 2; i <= num; i++) {
      count++;
      if (num % i == 0) {
        System.out.println("Dayandi, yoxlama sayi: " + count);
      }
    }
    long after = System.currentTimeMillis();
    System.out.println("Time passed: " + (after - before));
    System.out.println("test 1 ---\n\n");

    System.out.println("test 2 ---");
    int count2 = 0;
    int sqrt = (int) Math.sqrt(999982);
    System.out.println(sqrt);
    long before2 = System.currentTimeMillis();
    for (int i = 2; i <= sqrt; i++) {
      count2++;
      if (i == sqrt) {
        System.out.println("Dayandi, yoxlama sayi: " + count2);
      }
    }
    long after2 = System.currentTimeMillis();
    System.out.println("Time passed: " + (after2 - before2));
    System.out.println("test 2 ---");

  }
}
