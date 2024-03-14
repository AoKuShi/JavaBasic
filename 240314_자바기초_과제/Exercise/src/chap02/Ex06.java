package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("화씨온도를 입력하세요 : ");
		double f = input.nextDouble();
		double c = 5*(f-32)/9;
		System.out.println("섭씨온도 : " + c);
		input.close();
	}

}
