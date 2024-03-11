package sequence;

import java.util.Scanner;

public class Sequence02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하세요(원) : ");
		int won = input.nextInt();
		int five;
		int one;
		
		five = (won - won%500)/500;
		one = (won%500 - (won%100)/100)/100;
		
		System.out.println(">> 500원 동전 " + five + "개와 100원 동전 " + one +"개가 필요합니다.");
		input.close();
		
	}

}
