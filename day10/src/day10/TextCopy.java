package day10;
import java.io.*;
public class TextCopy {
	public static void main(String[] args) {
		File orig = new File("C:\\Windows\\system.ini");
		File copy = new File("C:\\Temp\\system.txt");
		int c;
		try {
			FileReader fileReader = new FileReader(orig);
			FileWriter fileWriter = new FileWriter(copy);
			while((c=fileReader.read())!=-1) {
				fileWriter.write((char)c);
			}
			fileWriter.close();
			fileReader.close();
			System.out.println(orig.getPath()+"를 "+copy.getPath()+"로 복사하였습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
}
