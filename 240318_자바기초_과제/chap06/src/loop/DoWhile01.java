package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			int b = input.nextInt();
			if (b == 0) {
				break;
			}
			sum += b;
		}
		while (a == 0);
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
		input.close();
		
	}

}
