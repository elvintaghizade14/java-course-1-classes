package org.eminera.part01.oop.lesson23.lesson;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String msg) {
    super(msg);
  }
}
