package src.Exercise.chap03;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1;
    int sum = 0;
    do {
      System.out.print("양의 정수를 입력하세요 : ");
      a1 = sc.nextInt();
      if (a1 < 1) {
        break;
      }
      if (a1%2 == 0) {
        sum += a1;
      }

    } while (true);

    System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    sc.close();
  }
  
}
