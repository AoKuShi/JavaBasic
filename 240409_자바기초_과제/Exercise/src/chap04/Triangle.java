package chap04;

public class Triangle {
  private double base;
  private double height;
  


  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double findArea() {
    return base*height/2;
  }

  public boolean isSameArea(double area1) {
    if (area1 == base*height/2) {
      return true;
    }
    return false;

  }
}
