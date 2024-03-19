package method;

import java.util.Scanner;

public class EvenOdd03 {

	public static String decideEvenOdd(int a) {
		if (a%2 == 0) {
			return ">> 짝수입니다.";
		} else {
			return ">> 홀수입니다.";
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("숫자를 입력하세요 : ");
			int a = input.nextInt();
			
			String result = decideEvenOdd(a);
			System.out.println(result);
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			int b = input.nextInt();
			
			if (b == 0) {
				break;
			}
			
		}
		
		input.close();

	}
}
