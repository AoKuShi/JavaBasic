package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		String a = input.nextLine();
		
		int b = Integer.valueOf(a);
		
		
		if (b < 10) {
			System.out.print("각 자릿수의 합 = ");
			System.out.println(Integer.valueOf(a.substring(0,1)));
			
		} else if (b < 100) {
			System.out.print("각 자릿수의 합 = ");
			System.out.println(Integer.valueOf(a.substring(0,1)) + Integer.valueOf(a.substring(1,2)));
			
		} else {
			System.out.print("각 자릿수의 합 = ");
			System.out.println(Integer.valueOf(a.substring(0,1)) + Integer.valueOf(a.substring(1,2)) + Integer.valueOf(a.substring(2)));
			
		}

		input.close();
		

	}

}
