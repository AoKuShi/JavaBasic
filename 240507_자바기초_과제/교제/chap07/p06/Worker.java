package chap07.p06;

class Worker implements Human {
	public void echo() {
    System.out.println("하하하..");
	}

  @Override
	public void print() {
    System.out.println("인간입니다.");
	}

  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }

}
