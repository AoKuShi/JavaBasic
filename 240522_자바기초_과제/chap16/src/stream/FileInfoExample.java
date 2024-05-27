package stream;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {

	public static void main(String[] args) throws IOException {

		File imgDir = new File("C:/Temp/images"); // 생성할 디렉터리(images) 경로의 File 객체 생성
		File testFile = new File("C:/Temp/test.txt"); // 생성할 txt파일(test.txt) 경로의 File 객체 생성

		if (imgDir.exists() == false) {
			imgDir.mkdirs(); // 지정된 경로에 images 디렉터리 생성
			System.out.println(imgDir.getName() + "을 생성합니다."); // 생성 코멘트 출력
		}
		if (testFile.exists() == false) {
			testFile.createNewFile(); // 지정된 경로에 test.txt 파일 생성
			System.out.println(testFile.getName() + "을 생성합니다."); // 생성 코멘트 출력
		}

		File tempDir = new File("C:/Temp"); // Temp 디렉터리 경로의 File 객체 생성

		File[] contents = tempDir.listFiles(); // Temp 디렉터리 내의 요소를 배열로 저장
		System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
		
		for (File file : contents) { // Temp 디렉터리 내의 요소를 출력
			System.out.print("\t" + file.getName());
			if (file.isDirectory()) {
				System.out.print("<DIR>");
			} else {
				System.out.print("<" + file.length() + ">");
			}
			System.out.println();
		}

	}

}