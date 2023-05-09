package day10;
import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		File file01 = new File("C:\\Windows\\system.ini");
		System.out.println(file01.getPath());	//경로 출력
		System.out.println(file01.getName());	//파일 이름 출력
		System.out.println(file01.getParent());	//상위 폴더 이름 출력
		System.out.println(file01.isDirectory());	//디렉토리가 맞으면 true 아니면 false
		
		
		File file02 = new File("C:\\Temp\\sample");
		if(! file02.exists())file02.mkdir();	// 디렉토리 생성
		file02.renameTo(new File("C:\\Temp\\java_sample"));
	
		File file03 = new File("C:\\Temp");
		File[] subFiles = file03.listFiles();	// 파일명을 list형식으로 가져옴
		for(int i=0; i<subFiles.length; i++) {
			File file = subFiles[i];
			System.out.println(file.getName());
		}
	
	}	
}
