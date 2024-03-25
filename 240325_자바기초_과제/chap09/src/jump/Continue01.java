package jump;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 4 || i == 7) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i*j);
				
			}
		}
	}
}