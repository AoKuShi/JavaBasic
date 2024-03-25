package src.Exercise.chap03;

import java.util.Scanner;

public class Ex10 {

  public static boolean isPrime(int a1) {
    boolean bool = true;
    for (int i = 2; i < a1; i++) {
      if (a1%i == 0) {
        bool = false;
      }
    }
    return bool;
  }
  public static void main(String[] args) {
    System.out.print("양의 정수를 입력하세요 : ");
    int num = new Scanner(System.in).nextInt();
    if (isPrime(num)) {
      System.out.println(num +"는 소수입니다.");
    } else {
      System.out.println(num +"는 소수가 아닙니다.");
    }

  }
  
}
