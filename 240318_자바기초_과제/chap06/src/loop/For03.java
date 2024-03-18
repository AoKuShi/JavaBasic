package loop;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		System.out.println("[ 구구단 " + a + "단 ]");
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " x " + i + " = " + (a*i));			
		}
		input.close();		
		
	}

}
