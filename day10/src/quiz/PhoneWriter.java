package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneWriter {
	public static void main(String[] args) {
		// 전화번호부
		File file = new File("C:\\Temp\\Phone.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			Scanner sc = new Scanner(System.in);
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.println("이름 전화번호 >>>>");
				String line = sc.nextLine();
				if(line.equals("exit"))break;
				
				fileWriter.write(line,0,line.length());
				fileWriter.write("\r\n");
				
			}
			sc.close();
			fileWriter.close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
