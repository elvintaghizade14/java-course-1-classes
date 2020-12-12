package org.eminera.oop.lesson22.lesson.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeApp {
  public static void main(String[] args) {

    Date dateOld;

    String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"));
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println(date);
    System.out.println(time);
    System.out.println(dateTime);
  }
}