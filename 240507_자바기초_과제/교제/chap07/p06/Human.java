package chap07.p06;

interface Human {
  void print();
  void eat();

  static void echo() {
    System.out.println("야호!!!");
  }
}