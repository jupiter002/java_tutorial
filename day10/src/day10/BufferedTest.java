package day10;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		
	int c;
	try {
		FileReader fileReader = new FileReader("C:\\Temp\\test022.txt");
		BufferedOutputStream buffered1 = new BufferedOutputStream(System.out, 1);
		while((c = fileReader.read())!=-1) {
			buffered1.write(c);
		}
		buffered1.flush();	//flush:메모리에 남아있는 찌꺼기 배출
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}