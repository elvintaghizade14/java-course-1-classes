package org.eminera.oop.lesson24.lesson.project.service.impl;

import org.eminera.oop.lesson24.lesson.project.service.UnknownService;

public class UnknownServiceImpl implements UnknownService {
  @Override
  public String process() {
    return "You entered wrong data...";
  }
}
