package method;

import java.util.Scanner;

public class Max01 {
	public static int m1(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("최대값은 " + m1(a,b,c) + "입니다.");
		input.close();

	}

}
