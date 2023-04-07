package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		// 객체 파일 읽어오기
		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			// 매개변수로 기본 스트림 넣어줌
			
			Person p = (Person) inputStream.readObject();
			// 역직렬화
			String newStr = (String) inputStream.readObject();
			
			p.tell();
			System.out.println(newStr);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
