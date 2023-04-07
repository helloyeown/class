package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		
		BufferedWriter out = null;
		// 바깥에 선언했기 때문에 close를 finally에 쓸 수 있음
		
		try {
			out = new BufferedWriter(new FileWriter("D:\\test\\test-text2.txt"));
			
			out.write("홍차(紅,茶)는 차잎 내부의 성분이 자체에 들어있는 효소에");
			out.write(" 산화되어 붉은 빛을 띠는 차를 뜻한다.");
			out.newLine();
			out.write("녹차나 보이차와 같이 효소의 작용을 중지시키는 ");
			out.write(" 쇄청(曬靑, 햇볕에 쬐어 말림)");
			out.write(" 과정을 거치지 않기 때문에 잎 자체의 효소로 산화가 된 것이다.");
			out.newLine();
			out.write("동양에서는 우러난 차의 빛깔(붉은색)을 보고 홍차라고 하지만, ");
			out.write("서양에서는 찻잎의 색깔(검은색)을 보고 Black Tea라고 부른다.");
			out.newLine();
			out.newLine();
			out.write("wiki 참조");
			
			System.out.println("작성 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null)
				try {
					out.close();
					System.out.println("close() 실행");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
