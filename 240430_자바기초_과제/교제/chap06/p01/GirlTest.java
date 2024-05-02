package chap06.p01; //p254~p256 도전과제

public class GirlTest {
  public static void main(String[] args) {
    // Girl g1 = new Girl();
    // Girl g2 = new GoodGirl();
    // GoodGirl gg = new BestGirl();

    // g2.show();
    // gg.show();

    Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐") , new BestGirl("황진이")};

    for (Girl g : girls) {
      g.show();
    }

  }
  
}
