package org.eminera.oop.lesson17.lesson.inh;

public class EqualsStrings {
  public static void main(String[] args) {
    String elvin = "Elvin";                     // 123456
    String ismayil = "Ismayil";                 // 456789
    String elvin2 = "Elvin";                    // 123456
    String elvin3 = new String("Elvin");      // 098345

    System.out.println(elvin == ismayil); // false
    System.out.println(elvin == elvin2);  // true
    System.out.println(elvin == elvin3);  // false
  }
}
