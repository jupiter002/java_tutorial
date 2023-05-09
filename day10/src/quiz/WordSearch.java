package quiz;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	public static void main(String[] args) {
		// 단어를 입력하면 해당하는 단어 찾아주기
		// words.txt 읽어서 vector 넣어야 한다.
		String meta = "";
		Vector<String> V_eng = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		
		try {
			FileInputStream eng = new FileInputStream("C:\\Users\\y\\Documents\\카카오톡 받은 파일\\words.txt");
			int c;
			while((c = eng.read())!=-1) {
				meta += (char)c;
				
			}
			String [] tokens = meta.split("ln");
			for(int i=0; i<meta.length(); i++) {
				V_eng.add(tokens[i]);
			}
			eng.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	
	}
}
