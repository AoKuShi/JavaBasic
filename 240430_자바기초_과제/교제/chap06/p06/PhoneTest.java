package chap06.p06;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};

    for (Phone phone : phones) {
      if (phone instanceof Smartphone) {
        phone.playGame();
      } else if (phone instanceof Telephone) {
        phone.autoAnswering();
      } else if (phone instanceof Phone) {
        phone.talk();
      }
    }



  }

  

}
