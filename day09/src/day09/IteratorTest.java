package day09;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("토르");
		nameList.add("아이언맨");
		nameList.add("캡틴아메리카");
		nameList.add("스파이더맨");
		nameList.add("aaaaaaaaaaaaaaa");
		
		
		
		Iterator<String> it = nameList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
		
//		
//		
		
		
	}
}
