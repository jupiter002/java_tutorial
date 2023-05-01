package ch03;

public class schEx05 {
	public static void main(String[]args) {
		
		char grade = '0';
		switch(grade) {
			case 'A':			//A이거나a이거나0일때
			case 'a':
			case '0':
				System.out.println("최고 등급입니다.");
			case 'B':	// B 이거나 b인 경우(case)
			case 'b':
				System.out.println("중간 등급입니다.");
				break;		//switch문 탈출
			default:		// 값이 없을 경우
				System.out.println("최저 등급입니다.");
		}
		
		
		
	}

}
