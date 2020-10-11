package org.eminera.lesson05;

public class BreakApp {
  public static void main(String[] args) {

    // 1-den 100-e kimi ededlere bax.
    // ilk ve yalniz hem 2-ye, hem 3-e, hem 5-e bolunen eded hansi olsa
    // onu cap et ve proqrami dayandir.

    int counter = 0;
    long before = System.currentTimeMillis();
    for (int i = 1; i <= 1000000; i++) {
      if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
        counter++;
        if (counter == 5) {
          System.out.println("ilk hem 2-ye, hem 3-e, hem 5-e bolunen eded = " + i);
          break;
        }
      System.out.println("counter = " + counter);
      }
    }
    System.out.println("My counter = " + counter);
    long after = System.currentTimeMillis();
    System.out.println("time solved: " + (after - before));

    // break:     1
    // non-break: 17
   }
}
