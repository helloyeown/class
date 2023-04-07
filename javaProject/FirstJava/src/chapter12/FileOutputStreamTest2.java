package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			OutputStream fout = new FileOutputStream("D:\\test\\test1.txt");
			// 매개변수에 경로 지정, 파일 name
			
			String str = "HI";
			byte[] arr = str.getBytes();
			// String class에서 문자열의 byte 배열을 반환
			
			fout.write(arr);
			fout.close();	// i/o에서는 스트림 사용 후 반드시 닫기
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
