package ch03;

public class schEx02 {
	public static void main(String[] args) {
		int time = 8;
		switch(time) {		//해당 케이스부터 밑에있는 모든 실행문을 실행함.
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의르ㅡㄹ 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:		//default는 정해진 위치가 없음. 단지 만족한 케이스가 우선이기 떄문에 밑으로 내릴뿐.
				System.out.println("외근을 나갑니다.");
				
		}
		
		
		
	}
}
