package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = input.nextInt();
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = false;
		
		if (a%4 == 0 && a%5 == 0) {
			b1 = true;
		}
		
		if (a%4 == 0 || a%5 == 0) {
			b2 = true;
		}
		
		if (a%4 == 0 || a%5 == 0) {
			if (!(a%4 == 0 && a%5 == 0)) {
				b3 = true;
			}
		}
		
		System.out.println("4와 5로 나누어지는가? " + b1);
		System.out.println("4 또는 5로 나누어지는가? " + b2);
		System.out.println("4와 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는가? " + b3);
		input.close();

	}

}
