package org.eminera.oop.lesson21.lesson.excep.user;

public class LoginApp {
  public static void main(String[] args) {

    String username = "Elvin1";

    try {
      boolean b = checkUsername(username);
    } catch (UserNotFoundException userNotFoundException) {
      System.out.println("istifadeci tapilmadi." + userNotFoundException.getMessage());
    }

  }

  private static boolean checkUsername(String username) throws UserNotFoundException, IllegalAccessError, IllegalArgumentException {
    if (username.equalsIgnoreCase("Elvin")) return Boolean.TRUE;
    else throw new UserNotFoundException("User not found!");
  }
}