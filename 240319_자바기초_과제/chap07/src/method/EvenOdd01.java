package method;

import java.util.Scanner;

public class EvenOdd01 {
	
	public static void decideEvenOdd() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		if (a%2 == 0) {
			System.out.println(">> 짝수입니다.");
		} else {
			System.out.println(">> 홀수입니다.");
		}
		
	}

	public static void main(String[] args) {
		while (true) {
			
			decideEvenOdd();
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			Scanner input = new Scanner(System.in);
			int b = input.nextInt();
			
			if (b == 0) {
				break;
			}
			input.close();
			
		}

	}

}
