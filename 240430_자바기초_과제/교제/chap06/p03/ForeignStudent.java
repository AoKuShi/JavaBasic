package chap06.p03;

public class ForeignStudent extends Student {
  String cont;

  ForeignStudent(String type, String name, int age, int num, String cont) {
    super(type, name, age, num);
    this.cont = cont;
  }

  void show() {
    System.out.println(type + "[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num + ", 국적 : " + cont + "]");
  }
}
