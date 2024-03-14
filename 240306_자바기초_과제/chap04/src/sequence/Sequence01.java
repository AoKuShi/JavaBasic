package sequence;

import java.util.Scanner;

public class Sequence01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("변수에 a에 넣을 숫자 입력 : ");
		int a = input.nextInt();
		System.out.print("변수에 b에 넣을 숫자 입력 : ");
		int b = input.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("Swapping 결과 >");
		System.out.println("변수 a의 값 = " + a);
		System.out.println("변수 b의 값 = " + b);
		input.close();

	}

}
