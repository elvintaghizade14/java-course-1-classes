package org.eminera.part01.oop.lesson18.lesson.enums;

public class MyLog {
  String msg;
  DayOfWeek dayOfWeek;

  public MyLog(String msg, DayOfWeek dayOfWeek) {
    this.msg = msg;
    this.dayOfWeek = dayOfWeek;
  }

  @Override
  public String toString() {
    return String.format("MyLog[msg='%s', weekday='%s']", msg, dayOfWeek);
  }


}