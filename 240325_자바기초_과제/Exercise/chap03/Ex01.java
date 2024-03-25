package src.Exercise.chap03;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();

    if (a1 >= 19) {
      System.out.println("성년");
    } else {
      System.out.println("미성년");
    }
    sc.close();
  }
  
}
