package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int a = input.nextInt();
		int s = a%60;
		int m = ((a - a%60)/60)%60;
		int h = (((a - a%60)/60) - ((a - a%60)/60)%60)/60;
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		input.close();
	}

}
