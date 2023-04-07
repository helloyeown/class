package chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("D:\\test\\font.zip");
			BufferedInputStream bin = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("D:\\test\\fontcopy2.zip");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			// 필터 스트림 사용시 기본 스트림 필요, 매개변수로 기본 스트림 넣어줌
			
			int byteData = 0;
			
			while(true) {
				byteData = bin.read();	// 다 받고나면 -1 반환
				if(byteData==-1) break;
				// 무한반복문 벗어나는 장치
				// 새로운 파일에 똑같은 데이터를 쓰기
				bout.write(byteData);
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
