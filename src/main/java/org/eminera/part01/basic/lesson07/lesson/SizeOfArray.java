package org.eminera.part01.basic.lesson07.lesson;

public class SizeOfArray {
  public static void main(String[] args) {
    int[] array1 = {4, 6, 8};


//    index bashlayir -> 0
//    index bitir     -> 2
//    array1[0] --> 4
//    array1[1] --> 6
//    array1[2] --> 8
//    array1[3] --> exception atacaq (xeta bash verecek)

//    System.out.println(array1[3]);
//    System.out.println(array1[-1]);
//    System.out.println(array1[0]);

    int length = array1.length;
    System.out.println(length);

//    [4, 6, 8]

    System.out.print("[");
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i]);
      if (i != 2) System.out.print(", ");
    }
    System.out.print("]\n");

//    [4, 6, 8]

    int uzunluq = array1.length;
    System.out.println("Size of array is: " + uzunluq);
    System.out.println("Lat index of array is: " + (uzunluq - 1));
//    [4, 6, 8] -> [4, 6, 8, 10]
    array1[3] = 10;
  }
}