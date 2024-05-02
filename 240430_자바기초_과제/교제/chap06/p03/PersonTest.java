package chap06.p03; //p260_q2

public class PersonTest {
  public static void main(String[] args) {
    Person[] psArr = {new Person("사람", "길동이", 22), new Student("학생", "황진이", 23, 100), new ForeignStudent("외국학생", "Amy", 30, 200, "U.S.A")};

    for (Person ps : psArr) {
      ps.show();
    }

  }
}
