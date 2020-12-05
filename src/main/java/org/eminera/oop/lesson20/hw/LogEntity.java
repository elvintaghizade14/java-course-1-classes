package org.eminera.oop.lesson20.hw;

import java.time.LocalDateTime;

public class LogEntity {
  long id;
  long transactionId;
  String port;
  String description;
  LocalDateTime dateTime;

  {
    this.dateTime = LocalDateTime.now();
  }
}
