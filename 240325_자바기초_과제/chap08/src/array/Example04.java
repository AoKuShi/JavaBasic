package array;

public class Example04 {

	public static void main(String[] args) {
		int myArr[][] = {{1,2,3,4,5},{6,7,8,9,10},{10,11,12,13,15}};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(myArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("myArr[0][1] = " + myArr[0][1]);
	}

}
