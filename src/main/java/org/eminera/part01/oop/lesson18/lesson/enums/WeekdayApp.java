package org.eminera.part01.oop.lesson18.lesson.enums;

import static org.eminera.part01.oop.lesson18.lesson.enums.DayOfWeek.MONDAY;
import static org.eminera.part01.oop.lesson18.lesson.enums.DayOfWeek.THURSDAY;

public class WeekdayApp {
  public static void main(String[] args) {
    MyLog log1 = new MyLog("log #1", MONDAY);
    MyLog log2 = new MyLog("log #1", THURSDAY);

    String monday = DeepEnum.MONDAY;

    System.out.println(log1);
    System.out.println(log2);
  }
}