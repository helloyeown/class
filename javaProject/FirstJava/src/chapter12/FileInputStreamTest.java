package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("D:\\test\\test.txt");
			
			int i = fin.read();
			System.out.println(i);
			System.out.println((char)i);
			// int->char 유니코드를 문자로 형변환
			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");
			
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
}
