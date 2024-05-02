package chap06.p03;

public class Student extends Person {
  int num;

  Student(String type, String name, int age, int num) {
    super(type, name, age);
    this.num = num;
  }

  void show() {
    System.out.println(type + "[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num + "]");
  }

}
