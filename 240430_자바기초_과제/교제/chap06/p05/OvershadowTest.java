package chap06.p05; //p260_q4

public class OvershadowTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();

    p.p01();
    //p.p02(); //오류 : 오버라이딩된 메소드만 사용 가능하다
  }
}
