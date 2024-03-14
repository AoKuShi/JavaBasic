package scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		System.out.print("원의 반지름울 입력하세요.(cm): ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		System.out.println("원의 넓이는 " + 3.14*r*r + "cm입니다.");
		// TODO 자동 생성된 메소드 스텁
		input.close();

	}

}
