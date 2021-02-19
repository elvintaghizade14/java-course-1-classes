package org.eminera.part05.lesson39;

import java.util.List;

public class Controller {
  //  private final Service service;
  private Service service;

  public Controller() {
    super();
  }

  public Controller(Service service) {
    this.service = service;
  }

  public List<String> getAll() {
    return this.service.getAll();
  }

  public Service getService() {
    return this.service;
  }

  public void setService(Service service) {
    this.service = service;
  }
}