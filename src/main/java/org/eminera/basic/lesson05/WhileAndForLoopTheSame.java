package org.eminera.basic.lesson05;

public class WhileAndForLoopTheSame {
  public static void main(String[] args) {

    System.out.println("With for loop");

    int j = 1;
    for (; j <= 5; ) {
      System.out.print(j + " ");
      j++;
    }

    int i = 1;
    while (i <= 5) {
      System.out.print(i + " ");
      i++;
    }

//    for (; ; ) {
//      System.out.println("Infinite loop");
//      String s = new String("Elvin");
//      String s1 = new String("Taghizade");
//      String s2 = new String("Taghizade");
//      String s3 = new String("Taghizade");
//      String s4 = new String("Taghizade");
//      String s5 = new String("Taghizade");
//      // stackOverFlowException
//    }

  }
}