package chap06.p02;

public class Circle {
  int radius;
  
  Circle(int radius) {
    this.radius = radius;
  }
  
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }

}
