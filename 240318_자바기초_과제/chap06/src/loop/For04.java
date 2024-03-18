package loop;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int num = input.nextInt();
		
		int fac = 1;
		
		for (int i = num; i >= 1; i--) {
			fac *= i;
			
		}
		
		System.out.println(num + "! = " + fac);
		input.close();

	}

}
