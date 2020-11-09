package org.eminera.basic.lesson04;

import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//    int integer1 = input.nextInt();
//    double double1 = input.nextDouble();
//    long long1 = input.nextLong();
//    String word = input.next();
//    String sentence = input.nextLine();

//    System.out.println(integer1);
//    System.out.println(double1);
//    System.out.println(long1);

//    System.out.println(word);
//    System.out.println(sentence);

    System.out.println("Qiymeti daxil edin:");
    int grade = input.nextInt();
    if (grade > 50) System.out.println("Ela");
    else System.out.println("Pis");

//  data_type   variable_name   = value;
    int         age             = 5;              // primitive
    Insan       elvin           = new Insan();    // non-primitive (reference)
  }
}
