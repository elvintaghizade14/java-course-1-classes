package org.eminera.part01.oop.lesson23.hw.binary_file;

public class Potato {
  String name;
  String version;

  public Potato(String name, String version) {
    this.name = name;
    this.version = version;
  }

  @Override
  public String toString() {
    return String.format("Potato[name='%s', version='%s']", name, version);
  }
}