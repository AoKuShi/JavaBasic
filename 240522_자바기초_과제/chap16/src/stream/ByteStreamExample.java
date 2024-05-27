package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		String orgFilename = "Curi_01.jpg"; // 복사 전 이미지 파일
		String copiedFilename = "Curi_01_copied.jpg"; // 복사 후 이미지 파일
		try { // 오류 예외처리
			FileInputStream fis = new FileInputStream(orgFilename); // 복사 전 파일로 FileInputStream 객체(fis) 생성
			FileOutputStream fos = new FileOutputStream(copiedFilename); // 복사 후 파일로 FileOutputStream 객체(fos) 생성
			copyEachOneByte(fis, fos); // copyEachOneByte 메서드 실행
			//copyEachKByte(fis, fos); // copyEachKByte 메서드 실행
			fos.flush(); // fos의 데이터를 flush(copiedFilename으로 FileOutputStream출력)
			fos.close(); // fos 닫기
			fis.close(); // fis 닫기
			System.out.println("복사가 완료되었습니다."); // 완료 메시지 생성
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage()); // 오류 시 에러 메시지 출력
		}	
	}

	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int byteInput; // 데이터를 옮기기 위한 변수생성
		while ((byteInput = fis.read()) != -1) { // fis에서 1바이트씩 읽어 fos에 저장
			fos.write(byteInput);
		}
	}
	
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024]; // 데이터를 옮기기 위한 변수생성
		while (fis.read(kbInput) != -1) { // fis에서 1키로 바이트씩 읽어 fos에 저장
			fos.write(kbInput);
		}
	}

}
