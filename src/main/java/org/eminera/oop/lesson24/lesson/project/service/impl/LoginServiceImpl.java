package org.eminera.oop.lesson24.lesson.project.service.impl;

import org.eminera.oop.lesson24.lesson.project.service.LoginService;

import static org.eminera.oop.lesson24.lesson.project.controller.Project.CONSOLE;

public class LoginServiceImpl implements LoginService {
  @Override
  public String process() {
    return "Login here!";
  }
}
