package org.eminera.lesson04;

public class GradingApp {
  public static void main(String[] args) {
    int grade = 100;

    // shert bloklari
    // 1. if () {...}
    // 2. if () {...}, else {...}
    // 3. if () {...}, else if () {...}, else {...}

    if (grade >= 91 && grade <= 100)       System.out.println("Ela");
    else if (grade >= 81 && grade <= 90)   System.out.println("Yaxshi");
    else if (grade >= 71 && grade <= 80)   System.out.println("Orta");
    else if (grade >= 61 && grade <= 70)   System.out.println("Zeif");
    else if (grade >= 51 && grade <= 60)   System.out.println("Kafi -> Chox zeif");
    else if (grade >= 0 && grade <= 50)    System.out.println("Siz bu fenden kesilmishsiniz!");
    else                                   System.out.println("Bele qiymet movcud deyil!");
  }
}