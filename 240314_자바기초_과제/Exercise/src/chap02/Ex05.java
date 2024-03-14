package chap02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();

		System.out.println((char)((int)(a.charAt(0)) - 32));
		input.close();

	}

}
