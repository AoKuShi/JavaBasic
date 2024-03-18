package loop;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int sum = 0;
		
		while (a > 0) {
			sum += a;
			a--;
		}
		
		System.out.println(sum);
		
		input.close();
		
		
	}

}
