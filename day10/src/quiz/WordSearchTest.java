package quiz;
import java.util.*;
import java.io.*;

public class WordSearchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\y\\Documents\\카카오톡 받은 파일\\words.txt");
		Vector<String> wordList = new Vector<>();

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader wordReader = new BufferedReader(fileReader);
			while(true) {
				String line = wordReader.readLine();
				if(line==null)break;
				wordList.add(line);
				
			}
			wordReader.close();
//			System.out.println(wordList.size());
			while(true) {
				System.out.println("단어를 입력하세요 >>>> ");
				String search = sc.nextLine();
				if(search.equals("그만")||search.equals("stop it"))break;
				for(int i=0; i<wordList.size();i++) {	
					String word = wordList.get(i);
					if(word.length()<search.length())continue;
					String frontword = word.substring(0, search.length());
					if(search.equals(frontword)) {
						System.out.println(word);
					}
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
