package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderhangul {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\hangul.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"ms949");
			System.out.println("인코딩 방식은==="+inputStreamReader.getEncoding());
			int c;
			while((c=inputStreamReader.read())!=-1) {
				System.out.print((char)c);
			}
			inputStreamReader.close();	//클래스 닫는건 연 순서 반대로
			fileInputStream.close();	// 분해는 조립의 역순
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
