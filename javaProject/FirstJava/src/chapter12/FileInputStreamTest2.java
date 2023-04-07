package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			InputStream fin = new FileInputStream("D:\\test\\test1.txt");
			
			int i=0;
			
			while(true) {
				i = fin.read();	// 읽어올 데이터가 없다면 -1 반환(규칙)
				if(i==-1) break;
				// 데이터를 다 읽고나면 break
				System.out.print((char)i);
			}
			
			System.out.println();
			
			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");
			
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
}
