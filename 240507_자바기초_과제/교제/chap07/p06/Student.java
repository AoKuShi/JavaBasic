package chap07.p06;

public class Student implements Human {
  int age;

  Student(int age) {
    this.age = age;
  }

  public void echo() {
    System.out.println("얏호!");
  }

  @Override
  public void print() {
    System.out.println(age + "세의 학생입니다.");
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

}
