package select;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int a = input.nextInt();
		char b;
		
		if (a >= 90) {
			b = 'A';
		} else if (a >= 80) {
			b = 'B';
		} else if (a >= 70) {
			b = 'C';
		} else if (a >= 60) {
			b = 'D';
		} else {
			b = 'F';
		}
		System.out.println("학점은 " + b + "입니다.");
		input.close();

	}

}
