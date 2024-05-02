package chap06.p06;

public class Phone {
  protected String owner;

  Phone (String owner) {
    this.owner = owner;
  }

  void talk() {
    System.out.println(owner + "가 통화 중이다.");
  }

  public void autoAnswering() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'autoAnswering'");
  }

  public void playGame() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'playGame'");
  }
}
