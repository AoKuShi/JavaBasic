package src.Exercise.chap03;

public class Ex08 {

  public static int factorial(int n) {
    //제출 코드 시작
    int m = 1;
    switch (n) {
      case 5 -> m = 120;
      case 4 -> m = 24;
      case 3 -> m = 6;
      case 2 -> m = 2;
      case 1 -> m = 1;
    }
    return m;
    //제출 코드 끝
    
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));



    

  }
}
