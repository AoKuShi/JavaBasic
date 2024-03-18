package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("양의 숫자를 입력하세요 : ");
		int a = input.nextInt();
		
		while (true) {
			if (a < 1){
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
				a = input.nextInt();
			} else {
				break;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i <= a; i++) {
			sum +=i;
		}
		System.out.println("1부터 " + a + "까지의 합은 " + sum + "입니다.");
		input.close();
		


	}

}
