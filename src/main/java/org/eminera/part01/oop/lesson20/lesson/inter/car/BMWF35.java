package org.eminera.part01.oop.lesson20.lesson.inter.car;

import java.io.Serializable;

public class BMWF35 implements Vehicle, Autonomous, Serializable, Cloneable {

  //
  //
  //
  //
  //
  //

  public void autonomousBmw() {
    //
    //
    //
  }

  @Override
  public void speedUp() {
    System.out.println("BMW speed up!");
  }

  @Override
  public void makeAutonomous() {
    System.out.println();
  }

}
