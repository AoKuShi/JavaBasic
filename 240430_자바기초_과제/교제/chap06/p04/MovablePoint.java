package chap06.p04; //p261_q3

public class MovablePoint extends Point {
  private int xSpeed;
  private int ySpeed;

  MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }
  public int getySpeed() {
    return ySpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }
  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  public String toString() {
    return "좌표(x,y) : " + getX() + ", " + getY() + " / 이동 속도(xSpeed,ySpeed) : " + xSpeed + ", " + ySpeed;
  }

}
