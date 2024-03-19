package method;

import java.util.Scanner;

public class Sum01 {
	
	public static int m1(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i; 
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while (true) {
			System.out.print("양의 숫자를 입력하세요 : ");
			a = input.nextInt();
			
			if (a <= 0) {
				System.out.println("다음에 또 봐요~~~");
				break;
			}
			
			System.out.println(m1(a));
			
			
		}
		
		input.close();

	}

}
