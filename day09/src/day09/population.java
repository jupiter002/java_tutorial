package day09;
import java.util.*;
public class population {
	public static void main(String[] args) {
		HashMap<String, Integer> popul = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		
		popul.put("한국", 5000);
		popul.put("미국", 30000);
		popul.put("중국", 100000);
		popul.put("인도", 50000);
		popul.put("일본", 15000);
		
		
		while(true) {
			String country = sc.next();
			if(country.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			Integer population = popul.get(country);	// Integer같은wrapper클래스는 기본 값이 null임.
			if(population==null) {
				System.out.println("입력되어 있지 않는 나라입니다.");
			}
			System.out.println(country+"의 인구는"+population+"입니다.");
			
			
		}
		
		
		
		
	}
}
