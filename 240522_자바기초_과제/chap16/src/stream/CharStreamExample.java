package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		String orgFilename = "D1_Student.txt"; // 복사 전 텍스트 파일
		String copiedFilename = "D1_Student_copied.txt"; // 복사 후 텍스트 파일
		
		try {
			FileReader fr = new FileReader(orgFilename); // 복사 전 파일로 FileReader 객체(fr) 생성
			FileWriter fw =new FileWriter(copiedFilename); // 복사 후 파일로 FileWriter 객체(fw) 생성
			copyCharData(fr, fw); // copyCharData 메서드 실행
			//copyCharArrData(fr, fw); // copyCharArrData 메서드 실행
			fw.flush(); // fw의 데이터를 flush(copiedFilename으로 FileWrite출력)
			fw.close(); // fw 닫기
			fr.close(); // fr 닫기
			System.out.println(orgFilename + " 복사가 완료되었습니다."); // 완료 메시지 생성
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage()); // 오류 시 에러 메시지 출력
		}
	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100]; // 데이터를 옮기기 위한 변수생성
		while (fr.read(charArrData) != -1) { // fr에서 100글자씩 읽어 fw에 저장
			System.out.print(charArrData);
			fw.write(charArrData);
		}
		
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData; // 데이터를 옮기기 위한 변수생성
		while ((charData = fr.read()) != -1) { // fr에서 1바이트씩 읽어 fw에 저장
			System.out.print((char)charData);
			fw.write(charData);
		}
	}

}
