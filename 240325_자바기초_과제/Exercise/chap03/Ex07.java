package src.Exercise.chap03;

import java.util.Scanner;

public class Ex07 {
  public static String m1() {
    Scanner sc = new Scanner(System.in);
    System.out.print("철수 : ");
    String a1 = sc.nextLine();
    return a1;
  }
  
  public static String m2() {
    Scanner sc = new Scanner(System.in);
    System.out.print("영희 : ");
    String a2 = sc.nextLine();
    return a2;
  }

  public static String m3(String a1, String a2) {
    if (a1.equals(a2)) {
      return "무승부";
    } else if ((a1 == "r" && a2 == "s") || (a1 == "p" && a2 == "r") || (a1 == "s" && a2 == "p")) {
      return "철수, 승!";
    } else {
      return "영희, 승!";
    }
  }
  
  public static void main(String[] args) {

    System.out.println(m3(m1(), m2()));

  }
  
}
