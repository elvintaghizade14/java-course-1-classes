package org.eminera.lesson09.lesson;

import java.util.Scanner;

public class SnakeApp {
  public static void main(String[] args) {
//    1. input
    Scanner sc = new Scanner(System.in);
    System.out.print("Ededi daxil edin:");
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

//    2. process
    /*
    1 2 3
    4 5 6
    7 8 9
     */
    int count = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = count++;
      }
    }

//    3. output
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }


  }
}
