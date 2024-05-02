package chap06.p07;

public class Car extends Vehicle {
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  
  void show() {
    System.out.println("색상 : " + color + ", 속도 : " + speed + ", 배기량 : " + displacement + ", 기어 단수 : " + gears);
  }

}
