package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		
		// 객체와 msg 저장
		Person person = new Person("King", 20);
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			// 경로 지정 안 하면 프로젝트 폴더에 저장 됨
			outputStream = new ObjectOutputStream(fos);
			
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			
			System.out.println("저장");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
