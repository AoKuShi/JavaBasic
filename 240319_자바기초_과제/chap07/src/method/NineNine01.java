package method;

public class NineNine01 {
	
	public static void m1(int i) {
		System.out.println("[ 구구단 " + i + "단 ]");
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " X " + j + " = " + i*j);
		} 
	}

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			m1(i);
			System.out.println();
		}
		
	}

}