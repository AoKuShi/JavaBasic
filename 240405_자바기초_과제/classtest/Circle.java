package classtest;

class Circle {
	double radius;
	final double PI = 3.14;
	
	double getArea() {
		return PI * radius * radius;
	}
	
	void show(double radius, double area) {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}