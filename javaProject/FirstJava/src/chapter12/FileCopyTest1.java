package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {
		
		// 원본파일: 파일 데이터를 읽어와야 함
		// 복사본: 원본 파일의 데이터를 써야함
		
		try {
			InputStream in = new FileInputStream("D:\\test\\test1.txt");
			OutputStream out = new FileOutputStream("D:\\test\\test1copy.txt");
			
			int byteData = 0;
			
			while(true) {
				byteData = in.read();	// 다 받고나면 -1 반환
				if(byteData==-1) break;
				// 무한반복문 벗어나는 장치
				// 새로운 파일에 똑같은 데이터를 쓰기
				out.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("파일을 복사했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
