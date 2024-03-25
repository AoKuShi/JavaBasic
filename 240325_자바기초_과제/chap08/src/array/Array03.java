package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {
	
	public static int getNumberKeyboard(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(br.readLine());
	}
	
	
	public static int[] getScoresLine(int num) throws IOException {
		int[] myArr = new int[num];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		for (int i = 0; i < num; i++) {
			myArr[i] = Integer.parseInt(st.nextToken());
		}
		return myArr;
	}
	
	
	public static void printSumAverage(int[] maArr) {
		int sum = 0;
		for (int i = 0; i < maArr.length; i++) {
			sum += maArr[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/maArr.length));
	}
	

	public static void main(String[] args) throws IOException {
		int numStudent = getNumberKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
		
	}

}
