package quiz;
import java.util.*;
import java.io.*;

public class PhoneReader {
	public static void main(String[] args) {
	File file = new File("C:\\Temp\\Phone.txt");
	int c;
	try {
		FileReader filereader = new FileReader(file);
		while(true) {
			c = filereader.read();
			if(c == -1)break;
			System.out.print((char)c);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
