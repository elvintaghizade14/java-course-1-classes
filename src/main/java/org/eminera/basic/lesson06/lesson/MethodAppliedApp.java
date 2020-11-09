package org.eminera.basic.lesson06.lesson;

import java.util.Scanner;

public class MethodAppliedApp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

//    short shortVariable = shortExample();
//    System.out.println(shortVariable);

    for (int i = 0; i < 5; i++) {
      System.out.println("Ededi daxil edin:");
      int eded = in.nextInt();

      String cavab = isEvenOrOdd2(eded);
      System.out.println("Metodumun cavabi beledir: " + cavab);
    }
  }

  static String isEvenOrOdd(int eded) {
    if (eded % 2 == 0) return "CUT eded";
    else return "TEK eded";
  }

  static String isEvenOrOdd2(int eded) {
    return (eded % 2 == 0 ? "CUT eded" : "TEK eded");
  }

  static short shortExample() {
    return 34;
  }
}
