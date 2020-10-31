package org.eminera.lesson11.lesson.string;

public class StringMethodsApp {
  public static void main(String[] args) {
    String name = "Elvin";
    System.out.println(name.charAt(0));
    System.out.println(name.codePointAt(2));
    System.out.println((int) 'v');
    System.out.println(name.replace('v', 'V')); // "ElVin"
    System.out.println("   Elvi   n ".trim());
    System.out.println(name.substring(1));
    System.out.println(name.substring(1, 3));
    String[] split = "name@gma@il.@co@m".split("@");
    System.out.println(split[0]);
    System.out.println(split[1]);
    System.out.println(split[2]);
    System.out.println(split[3]);
    System.out.println(split[4]);
    String abc = "Alma#armud$heyva@nar"; // regex -> regular expression
    String[] split1 = abc.split("#")[1].split("\\$")[2].split("@");

  }
}
