package org.eminera.lesson08.hw;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class Hw4 {
  public static void main(String[] args) {
    int[] arr1 = {2, 1, 4, 3, 5, -2};
    double[] arr2 = new double[]{6.0, 7.1, 8.2, 9.3, 10.5};
    String[] arr3 = new String[2];
    arr3[0] = "Elvin";
    arr3[1] = "Taghizade";

    System.out.printf("Size of arr3 is %d\n", arr3.length);
    System.out.println(arr3[0] + " " + arr3[1]);

    int max = arr1[0];
    int min = arr1[0];
    int sum = arr1[0];
    int len = arr1.length;

    for (int i = 1; i < len; i++) {
//      if (max < arr1[i]) max = arr1[i];
//      min = min > arr1[i] ? arr1[i] : min;
      max = Math.max(max, arr1[i]);  // arr[0] ? arr[0]
      min = Math.min(min, arr1[i]);
      sum += arr1[i];
    }

    double avg = (double) sum / len;

    System.out.printf("Max is %d, min is %d, sum is %d, average is %s\n", max, min, sum, avg);

//    DoubleSummaryStatistics stat = Arrays.stream(arr2).summaryStatistics();
//    System.out.println("max is with stream: " + stat.getMax());
  }
}
