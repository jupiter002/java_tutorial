package day09;

import java.util.HashMap;
import java.util.Scanner;

public class hashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("apple", "사과");
		dictionary.put("orange", "오렌지");
		dictionary.put("kiwi", "키위");
		
		String kor = dictionary.get("orange");
		System.out.println(kor);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("찾고 싶은 단어를 입력해주세요");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor1 = dictionary.get(eng);
			if(kor1==null) {
				System.out.println("없는 단어입니다.");
			}
			else {
				System.out.println(kor1);
			}
			
		}
		
		
		
		
		
		
	}
}
