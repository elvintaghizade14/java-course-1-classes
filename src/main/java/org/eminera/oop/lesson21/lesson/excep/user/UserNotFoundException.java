package org.eminera.oop.lesson21.lesson.excep.user;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String msg) {
    super(msg);
  }
}