package org.eminera.part05.lesson39;

import java.util.List;

public class Service {
  //  private final DAO dao;
  private DAO dao;

  public Service() {
    super();
  }

  public Service(DAO dao) {
    this.dao = dao;
  }

  public List<String> getAll() {
    return this.dao.getAll();
  }

  public DAO getDao() {
    return this.dao;
  }

  public void setDao(DAO dao) {
    this.dao = dao;
  }
}