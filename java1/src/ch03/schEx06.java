package ch03;

public class schEx06 {
	public static void main(String[] args) {
		int score = 96;
		switch(score/10) {
			case 10: case 9:		// case들 가로로 나열해도 상관 없음.
				System.out.println("A");
			case 8: case 7:
				System.out.println("B");
			break;
			default:
				System.out.println("F");
		
		}
		
		
		
		
	}
}
