package day09;
import java.util.*;
public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("아무개",85);
		score.put("김아무개",92);
		score.put("최아무개",22);
		score.put("송아무개",33);
		
		Set<String>keyList = score.keySet();	//Set은 중복을 허용하지 않음.
		Iterator<String> it = keyList.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+" : "+num);
		}
		
//		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}
}
