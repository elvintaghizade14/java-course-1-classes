package org.eminera.part01.oop.lesson24.lesson.project.constant;

import org.eminera.part01.oop.lesson24.lesson.project.service.SchoolManagementService;
import org.eminera.part01.oop.lesson24.lesson.project.service.impl.LoginServiceImpl;
import org.eminera.part01.oop.lesson24.lesson.project.service.impl.QuitServiceImpl;
import org.eminera.part01.oop.lesson24.lesson.project.service.impl.RegisterServiceImpl;
import org.eminera.part01.oop.lesson24.lesson.project.service.impl.UnknownServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Menu {
  QUIT("0", "Quit", new QuitServiceImpl()),
  LOGIN("1", "Login", new LoginServiceImpl()),
  REGISTER("2", "Register", new RegisterServiceImpl()),
  UNKNOWN("-1", "Unknown", new UnknownServiceImpl());

  final String id;
  final String label;
  final SchoolManagementService service;

  Menu(String id, String label, SchoolManagementService service) {
    this.id = id;
    this.label = label;
    this.service = service;
  }

  public static String showMenu() {
    return menuList().stream()
            .filter(menu -> menu != UNKNOWN)
            .map(menu -> menu.toString())     // f:(A -> B)
            .collect(Collectors.joining("\n"))
            .concat("\n");
  }

  public static Menu findMenu(String menuId) {
    return menuList().stream()
            .filter(menu -> menu.id.equalsIgnoreCase(menuId))
            .findFirst()
            .orElse(Menu.UNKNOWN);
  }

  public String process() {
    return this.service.process();
  }

  private static List<Menu> menuList() {
    return Arrays.asList(Menu.values());
  }

  @Override
  public String toString() {
    return String.format("%s. %s", id, label);
  }
}