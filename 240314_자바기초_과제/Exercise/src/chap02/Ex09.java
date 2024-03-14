package chap02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int s1 = input.nextInt();
		System.out.print("교양 이수 학점 : ");
		int s2 = input.nextInt();
		System.out.print("교양 이수 학점 : ");
		int s3 = input.nextInt();
		
		if (( s1 + s2 + s3 >= 140 ) && ( s1 >= 70 ) && ( (s2 >= 30 && s3 >= 30) || s2 + s3 >= 80 )) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가");
		}
		input.close();

	}

}
