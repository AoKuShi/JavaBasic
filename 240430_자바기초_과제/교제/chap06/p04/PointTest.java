package chap06.p04; //p260_q3

public class PointTest {
  public static void main(String[] args) {
    Point pt = new Point(3, 4);
    System.out.println(pt.toString());

    pt = new MovablePoint(2, 5, 8, 9);
    System.out.println(pt.toString());
  }
}
