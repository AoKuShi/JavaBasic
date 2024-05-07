package chap07.p02;

interface Delicious extends Edible, Sweetable {

  @Override
  default void eat() {
    System.out.println("eat!");
  }

  @Override
  default void sweet() {
    System.out.println("sweet!");
  }
}
