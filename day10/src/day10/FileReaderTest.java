package day10;
import java.io.*;


public class FileReaderTest {
	public static void main(String[] args) {
		try {	// try/catch는 예외 처리
			FileReader fileReader = new FileReader("C:\\Users\\y\\Desktop\\system.ini");
			int c;
			try {
				while((c = fileReader.read())!=-1) {
					System.out.print((char)c);
				}
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 여기 밑에 있는 코드 실행
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("입출력 오류");
		}
		
	}
}
