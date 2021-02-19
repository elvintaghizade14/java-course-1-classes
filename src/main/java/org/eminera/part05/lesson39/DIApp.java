package org.eminera.part05.lesson39;

import java.util.List;

public class DIApp {

  // constructor injection
  public static void main1(String[] args) {
    final DAO dao = new DAO();
    final Service service = new Service(dao);
    final Controller controller = new Controller(service);

    final List<String> all = controller.getAll();

    all.forEach(System.out::println);
  }

  // setter injection
  public static void main2(String[] args) {
    final DAO dao = new DAO();

    final Service service = new Service();
    service.setDao(dao);

    final Controller controller = new Controller();
    controller.setService(service);

    final List<String> all = controller.getAll();

    all.forEach(System.out::println);
  }

  public static void main(String[] args) {
    // POJO vs JavaBean (entity)
  }
}
