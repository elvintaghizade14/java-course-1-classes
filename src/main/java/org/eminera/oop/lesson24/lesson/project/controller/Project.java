package org.eminera.oop.lesson24.lesson.project.controller;

import org.eminera.oop.lesson24.lesson.project.constant.Menu;
import org.eminera.oop.lesson24.lesson.project.io.Console;
import org.eminera.oop.lesson24.lesson.project.io.LinuxConsole;
import org.eminera.oop.lesson24.lesson.project.io.WindowsConsole;

import java.awt.*;
import java.util.Scanner;

public class Project {
  private static final Scanner SCANNER = new Scanner(System.in);
  public static final Console CONSOLE
          = new LinuxConsole(SCANNER);
//            = new WindowsConsole();
  public static void run() {
    CONSOLE.print(Menu.showMenu());
    CONSOLE.printLn("Enter menu id: [0, 2]");
    Menu menu = Menu.findMenu(CONSOLE.readLn());
    CONSOLE.printLn(menu.process());
  }
}
