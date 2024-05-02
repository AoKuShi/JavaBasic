package chap06.p02; //p260_q1

public class CircleTest {
  public static void main(String[] args) {
    Circle cc = new Circle(5);
    cc.show();

    cc = new ColoredCircle(10, "빨간색");
    cc.show();
  }
}
