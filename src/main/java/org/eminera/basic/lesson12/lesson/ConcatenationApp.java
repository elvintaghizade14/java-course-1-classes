package org.eminera.basic.lesson12.lesson;

public class ConcatenationApp {
  public static void main1(String[] args) {
    System.out.println("A" + " B");  // ->A B
    System.out.println(5 + " B");    // ->5 B
    System.out.println(5 + 5);       // ->10

    System.out.println("Alma " +
            +'2'
            + " USD-yedir!");
//  Alma 2 USD-yedir!
    /*
  eger tereflerden biri Stringdirse, oz "+" isharesi cem kimi yox,
  eksine birleshdirme kimi rol oynayir.
   */
  }

  public static void main2(String[] args) {
    String alphabet = "a"; // a                     1
    alphabet += "b";       // a  +b     = ab        3
    alphabet += "c";       // ab +c     = abc       5
    alphabet += "d";       // abc+d     = abcd      7
    System.out.println(alphabet);

    String alma = "alma";
    alma = "armud";

//    Bura emeliyyatlar zamani HEAP-de neche String obyekti yaranib?


  }

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();
    stringBuilder.append("a").append(1).append(false).append('$');
    stringBuffer.append("b").append(2).append(true).append('@');
    System.out.println(stringBuilder);
    System.out.println(stringBuffer);

    String name = "Elvin"; // nivlE
    StringBuilder reverse = new StringBuilder(name).reverse();
    System.out.println(reverse);

    System.out.printf("Alma %d USD-yedir!", 12);
    String format = String.format("Alma %d USD-yedir!", 2);
    System.out.println(format);

    String concat = "Elvin".concat(" Taghizade");
    System.out.println(concat);

    /*
    "+"                <-
    String.format()    <-
    StringBuilder      <- suret
    StringBuffer       <- thread-safe
     */

  }
}