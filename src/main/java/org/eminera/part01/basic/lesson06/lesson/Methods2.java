package org.eminera.part01.basic.lesson06.lesson;

public class Methods2 {
  public static void main(String[] args) {

//    1. parametrsiz ve geriye hech ne qaytarmayan (void) -> bu tiplerde return olmaz!
    deleteCache();

//    2. parametrsiz ve geriye deyer qaytaran (return)
    String answer = isAnyJuiceThere();
    System.out.println("Method's answer is: " + answer);

//    3. parametrli ve geriye deyer qaytarmayan (void) ->  bu tiplerde return olmaz!
    takeBonus(100);

    int myMoney = 50; // menim 50 manat pulum var
//    4. parametrli ve geriye deyer qaytaran (return)
    int remain = buySomeCoffee(myMoney);
    System.out.println("Qaliq pulum : " + remain);

    System.out.println("-----------");

    menimMetodum(100, "Elvin", '$', 3.1415);

  }

  static void menimMetodum(int p1, String p2, char p3, double p4) {
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
  }

  public static void main2(String[] args) {
    /*
    Method novleri:

    1. parametrsiz ve geriye hech ne qaytarmayan (void) -> bu tiplerde return olmaz!
    2. parametrsiz ve geriye deyer qaytaran (return)

    3. parametrli ve geriye deyer qaytarmayan (void) ->  bu tiplerde return olmaz!
    4. parametrli ve geriye deyer qaytaran (return)
     */
  }


  private static void takeBonus(int bonusToWorker) {
//    System.out.println("Worker is happy");
  }

  private static int buySomeCoffee(int money) {
    System.out.println("Coffee bought");
    int price = 22;
    return money - price; // qaliq pul
  }

  private static void deleteCache() {
    //    some operations here ...
  }

  private static String isAnyJuiceThere() {
    return "NO";
  }


}