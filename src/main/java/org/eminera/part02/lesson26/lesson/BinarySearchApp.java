package org.eminera.part02.lesson26.lesson;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class BinarySearchApp {
  public static void main(String[] args) {

    List<Integer> numbers = new Random().ints(1000, 0, 1000).sorted().boxed().collect(Collectors.toList());
//    int[] array = new Random().ints(50, 0, 1000).sorted().toArray();
    System.out.println(numbers);
    Integer scan = numbers.get(9);
    System.out.println(scan);

    int result = findNum(numbers, scan).get();

    System.out.println(result);
  }

  private static Optional<Integer> findNum(List<Integer> numbers, Integer scan) {
    int counter = 0;
    int left = 0;
    int right = numbers.size() - 1;
    while (left <= right) {
      int mid = (right + left) / 2;
      System.out.println(++counter);
      System.out.println("left is: " + left + " right is: " + right + " middle is: " + mid + " mid num is: " + numbers.get(mid));
      if (scan.equals(numbers.get(mid))) return Optional.of(mid);
      else if (scan > numbers.get(mid)) left = mid + 1;
      else if (scan < numbers.get(mid)) right = mid - 1;
    }
    System.out.println(++counter);
    return Optional.empty();
  }
}