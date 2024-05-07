package chap07.p05;

public class TV extends Controller {

  TV(boolean power) {
    super(power);

  }

  @Override
  void show() {
    if (power == true) {
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }

  @Override
  String getName() {
    return "TV";
  }
  
}
