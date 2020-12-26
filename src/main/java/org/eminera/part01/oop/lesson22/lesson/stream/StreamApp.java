package org.eminera.part01.oop.lesson22.lesson.stream;

import java.util.Arrays;

public class StreamApp {
  public static void main(String[] args) {
//    stream -> axin
//     arraydaki en boyuk ededi tapin:

    int[] nums = {-1, 2, 3, -34, 45, 6, 7, -3, 2, 6, 1203, -8, 34};

    int max = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    System.out.println("Max is: " + max);

    int streamMax = Arrays.stream(nums).max().orElse(nums[0]);
    System.out.println("StreamMax is: " + streamMax);

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        count++;
      }
    }
    System.out.println("Count of negatives: " + count);

    long streamCount = Arrays.stream(nums).filter(num -> num < 0).count();
    System.out.println("Count of negatives with stream: " + count);


    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }

    Arrays.stream(nums).forEach(System.out::println);

    System.out.println("\n------");

    int countPos = 0;
    for (int eded : nums) {
      if (eded >= 0) {
        countPos++;
      }
      System.out.print(eded + " ");
    }
    System.out.println("Count of Positives: " + countPos);

  }
}