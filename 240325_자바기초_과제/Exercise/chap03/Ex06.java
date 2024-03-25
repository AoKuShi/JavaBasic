package src.Exercise.chap03;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("철수 : ");
    String a1 = sc.nextLine();
    System.out.print("영희 : ");
    String a2 = sc.nextLine();

    if (a1.equals(a2)) {
      System.out.println("무승부");
    } else if ((a1 == "r" && a2 == "s") || (a1 == "p" && a2 == "r") || (a1 == "s" && a2 == "p")) {
      System.out.println("철수, 승!");
    } else {
      System.out.println("영희, 승!");
    }

    sc.close();

  }
  
}
