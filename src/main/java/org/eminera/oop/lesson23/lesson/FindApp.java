package org.eminera.oop.lesson23.lesson;

import java.util.Optional;

public class FindApp {

  static class User {
    String name;
    Integer id;

    public User() {
    }

    User(String name, Integer id) {
      this.name = name;
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("User{name='%s', id=%d}", name, id);
    }
  }

  public static void main(String[] args) {

//    try {
//      userOptional = findUser(id);
//      System.out.println(userOptional);
//    } catch (UserNotFoundException e) {
//      System.out.println("ID duzgun daxil edilmeyib. Bazada bele bir istifadeci movcud deyil!");
//    }
    int id = 6;
    Optional<User> userOptional = findUser(id);

    String result = userOptional.map(user -> user.name)
            .orElseThrow(() -> new UserNotFoundException("istifacedi tapilmadi!"));
//            .orElse("istifacedi tapilmadi!");

    System.out.println(result);
  }

  private static Optional<User> findUser(int id) throws UserNotFoundException {
    User user = new User("A", 5);
    if (id == 5) return Optional.of(user);
    else         return Optional.empty();
  }
}