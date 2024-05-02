package chap06.p03;

public class Person {
  String type;
  String name;
  int age;

  Person(String type, String name, int age) {
    this.type = type;
    this.name = name;
    this.age = age;
  }

  void show() {
    System.out.println(type + "[이름 : " + name + ", 나이 : " + age + "]");
  }



}
