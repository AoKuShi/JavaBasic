package chap04;

public class Dice {
  private String[] face;

  public Dice() {
    this.face = new String[] {"One", "Two", "Three", "Four", "Five", "Six"};
  }

  public String roll() {
    return face[(int)(Math.random()*6)];
  }
  
}
