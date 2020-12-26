package org.eminera.part01.oop.lesson21.lesson.excep;

public class UserApp {

  public static void main(String[] args) {


    int comPass = 1111;

    int dbPass = 1234;

    try {
      if (comPass == dbPass) {
        System.out.println("Login ugurlu!");
      } else {
        throw new WrongPasswordException("Sifre duzgun deyil!");
      }
    } catch (WrongPasswordException e) {
      System.out.println(e.getMsg());
    }


  }
}
