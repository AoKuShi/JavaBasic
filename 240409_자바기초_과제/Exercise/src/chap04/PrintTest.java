package chap04;

public class PrintTest {
  public static void main(String[] args) {
    Printer pt = new Printer(20, true); // 프린터용지 기본값
    pt.print(25);
    pt.setDuplex(false);
    pt.print(10);

  }















}
