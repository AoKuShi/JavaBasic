package src.Exercise.chap03;

public class Ex09 {
  public static void foo(String a1, int a2) {
    System.out.println(a1 + " " + a2);
  }
  public static void foo(String a1, int a2, int a3) {
    System.out.println(a1 + " " + a2 + " " + a3);
  }
  public static void foo(String a1) {
    System.out.println(a1);
  }
  public static void main(String[] args) {
    foo("안녕", 1);
    foo("안녕하세요", 1, 2);
    foo("잘 있어");
  }
  
}
