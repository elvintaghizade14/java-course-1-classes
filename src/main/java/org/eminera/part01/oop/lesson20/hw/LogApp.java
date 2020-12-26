package org.eminera.part01.oop.lesson20.hw;

import java.time.LocalDateTime;

public class LogApp {
  public static void main(String[] args) {

    LogEntity logEntity = new LogEntity();
    logEntity.dateTime = LocalDateTime.now();
    System.out.println(logEntity.dateTime);

  }
}
