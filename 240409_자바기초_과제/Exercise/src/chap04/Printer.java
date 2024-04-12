package chap04;

public class Printer {
  private int numOfPapers;
  private boolean duplex;

  private boolean bool1; // 출력 논리연산자

  public Printer(int putPages, boolean duplex) { // 생성자
    this.numOfPapers = putPages;
    this.duplex = duplex;
  }

  public boolean getDuplex() {
    return duplex;
  }

  public void setDuplex(boolean duplex) {
    this.duplex = duplex;
  }

  public void putPages(int Pages) {
    this.numOfPapers += Pages;
  }

  public void print(int amount) {
    if (duplex == true) {
      if (amount%2 == 0) {
        amount /= 2;
      } else {
        amount = ++amount/2;
      }
    }

    if (numOfPapers == 0) {
      System.out.println("용지가 없습니다.");
      bool1 = true;
    } else if (numOfPapers < amount) {
      if (duplex == false) {
        System.out.print("단면으로 ");
      }
      System.out.println("모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
      numOfPapers = 0;
      bool1 = true;
    } else {
      if (duplex == true) {
        System.out.print("양면으로 ");
      }
      System.out.print(amount + "장 출력했습니다. ");
      numOfPapers -= amount;
    }
    if (bool1 == false) {
      System.out.println("현재 " + numOfPapers + "장 남아있습니다.");
    } else {
      bool1 = false;
    }
    
  }

  public int getNum() { // 접근자
    return numOfPapers;
  }


  // setter : 설정자

}
