package star;

public class Star02 {

	public static void main(String[] args) {
		int num = 5;
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 5; j > i - 1; j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
