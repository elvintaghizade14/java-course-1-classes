package org.eminera.part01.oop.lesson21.lesson.excep.user;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String msg) {
    super(msg);
  }
}