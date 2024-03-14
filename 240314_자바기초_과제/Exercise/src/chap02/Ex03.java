package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		double a = input.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double b = input.nextDouble();
		System.out.print("원기둥의 부피는 " + ((3.14 *a*a)*b));
		input.close();

	}

}
