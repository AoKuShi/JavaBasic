package array;

public class Array01 {

	public static void main(String[] args) {
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 98.7};
		
		int sum = 0;
		for (int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/gradeArr.length));

	}

}
