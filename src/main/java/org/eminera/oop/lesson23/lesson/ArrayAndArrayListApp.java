package org.eminera.oop.lesson23.lesson;

import java.util.ArrayList;

public class ArrayAndArrayListApp {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3};
    System.out.println(nums);

    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);

    System.out.println(arrayList.toString());

    arrayList.add(-1);
    arrayList.add(42);

    System.out.println(arrayList.toString());


  }
}