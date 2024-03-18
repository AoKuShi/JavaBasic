package loop;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int a = input.nextInt();
			if (a%2 == 0) {
				System.out.println(">> 짝수입니다.");
			} else {
				System.out.println(">> 홀수입니다.");
			}
			
			System.out.println("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			int b = input.nextInt();
			if (b == 0) {
				break;
			}
			
		}
		input.close();
		
	}

}
