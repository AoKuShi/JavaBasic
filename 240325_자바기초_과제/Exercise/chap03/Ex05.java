package src.Exercise.chap03;

public class Ex05 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      for (int j = 1; j <= 20; j++) {
        for (int j2 = 1; j2 <= 20; j2++) {
          if (i*i == j*j + j2*j2 && i + j + j2 <= 20) {
            System.out.println(i + " " + j + " " + j2);
          }
        }
        
      }
    }
  }
}
