package chap06.p01;

public class Girl {
  protected String name;

  Girl(String name) {
    this.name = name;
  }

  void show() {
    System.out.println(name + "는 자바 초보자이다.");
  }

}
