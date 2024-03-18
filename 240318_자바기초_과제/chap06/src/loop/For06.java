package loop;

public class For06 {

	public static void main(String[] args) {
		for (int a = 2; a < 10; a++) {
			System.out.println();
			System.out.println("[ 구구단 " + a + "단 ]");
			for (int i = 1; i < 10; i++) {
				System.out.println(a + " x " + i + " = " + (a*i));			
			}
		}
	}

}
