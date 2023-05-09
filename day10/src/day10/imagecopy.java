package day10;
import java.io.*;
import java.util.Date;

public class imagecopy {
	public static void main(String[] args) {
		File origIMG = new File ("C:\\Temp\\fruit.jpg");
		File copyIMG = new File("C:\\Temp\\fruit_copy.jpg");
		Date date = null;
		int c;
		
		try {
			FileInputStream fileInputStream = new FileInputStream(origIMG);
			FileOutputStream fileOutputStream = new FileOutputStream(copyIMG);
			byte buffer[] = new byte[1024];
			date = new Date();
			long start = date.getTime();
			
//			while((c = fileInputStream.read())!=-1) {	//-1을 넣는이유: eof>>end of file
//				fileOutputStream.write((byte)c);	//이미지는 타입으로 byte, 문자는 char를 넣음
//			}
			while(true) {
				int num = fileInputStream.read(buffer);
				System.out.println(num);
				fileOutputStream.write(buffer,0,num);
				if(num<buffer.length)break;
			}
			date = new Date();
			long end = date.getTime();
			System.out.println((end-start));
			
			fileInputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {	//Exception:예외 처리 클래스의 최상위 클래스
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
