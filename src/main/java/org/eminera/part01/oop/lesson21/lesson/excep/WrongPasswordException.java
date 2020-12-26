package org.eminera.part01.oop.lesson21.lesson.excep;

public class WrongPasswordException extends RuntimeException {
  private String msg;

  public WrongPasswordException(String msg) {
   this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }
}
