package chap06.p01;

public class BestGirl extends GoodGirl {
  

  BestGirl(String name){
    super(name);
  }

  //@Override
  void show(){
    System.out.println(name + "는 자바를 무지하게 잘 안다.");
  }
}

