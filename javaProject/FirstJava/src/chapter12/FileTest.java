package chapter12;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File file1 = new File("d:\\test\\test-text.txt");
		File dir1 = new File("d:\\tests");
		// 파일은 그냥 경로를 저장하는 용도
		
		System.out.println(dir1.exists());

		if(!dir1.exists()) {
			// 폴더가 존재하지 않으면 폴더를 생성
			dir1.mkdir();
			System.out.println("tests 폴더를 생성했습니다.");
		}
		
		if(file1.exists()) {
			System.out.println("파일이 존재합니다.");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		File dir2 = new File("d:\\test");
		
		File newFile = new File("d:\\test", "test-text2.txt");
		File newFile2 = new File(dir2, "test-text2.txt");
		
		System.out.println("파일인지 확인: " + newFile.isFile());
		System.out.println("폴더인지 확인: " + dir2.isDirectory());
		
		File[] list = dir2.listFiles();
		// dir2 경로에 있는 리스트를 배열로 반환
		// 반복문으로 반복 작업 가능
		
		System.out.println("test 폴더 =============");
		for(File file : list) {
			if(file.isDirectory()) {
				System.out.print("[DIR] ");
			} else if(file.isFile()) {
				System.out.print("[File] ");
			}
			System.out.println(file.getName());
		}

		
		File newPathFile = new File("d:\\test\\abc", "test-text2.txt");
		// 파일 이동
		newFile.renameTo(newPathFile);
		System.out.println("파일 이동 완료");
		
	}
}