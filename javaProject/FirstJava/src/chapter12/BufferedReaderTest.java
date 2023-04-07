package chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		String str = null;
		
		// Reader 객체 생성
		try {
			in = new BufferedReader(new FileReader("D:\\test\\test-text2.txt"));
			
			while(true) {
				str = in.readLine();
				// 한 줄씩 읽어옴
				if(str==null) break;
				System.out.println(str);
			}
			System.out.println("읽기 종료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(in!=null) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
