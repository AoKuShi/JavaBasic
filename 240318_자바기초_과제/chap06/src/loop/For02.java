package loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			int a = input.nextInt();
			sum += a; 
		}
		System.out.println("5개의 숫자의 합은 " + sum + "입니다.");
		input.close();
		

	}

}
