package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fileWriter = new FileWriter("C:\\Temp\\my.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length()==0)break;	// 탈출
				fileWriter.write(line,0,line.length());
				fileWriter.write("\r\n");	//캐리지 리턴(줄바꿈)
			}
			fileWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	
	}
}
