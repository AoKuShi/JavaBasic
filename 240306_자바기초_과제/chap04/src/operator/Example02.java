package operator;

public class Example02 {

	public static void main(String[] args) {
		int x = 10, y = 10;

		// 관계 연산자
		System.out.println(x == 10);
		System.out.println("x와 y는 같습니까? " + (x == y));

		System.out.println();

		// 논리 연산자
		System.out.println(x < 10 && x < 20);
		System.out.println(x < 10 || x < 20);
		System.out.println(!(x < 10 && x < 20));

	}

}
