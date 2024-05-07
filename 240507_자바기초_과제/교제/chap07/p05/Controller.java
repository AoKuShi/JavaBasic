package chap07.p05;

abstract class Controller {
  boolean power;

  Controller(boolean power) {
    this.power = power;
  }

  void show() {}
  
  abstract String getName();
}
