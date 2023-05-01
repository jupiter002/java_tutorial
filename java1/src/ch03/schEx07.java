package ch03;

public class schEx07 {
	public static void main(String[] args) {
		
//		int score = 0;
//		String grade = "B";
//		switch(grade) {
//			case "A":
//				score = 100;
//			case "B":
//				score=80;
//				break;
//			default:
//				score = 60;
//		}
//		System.out.println("score는 : " +score);
		
		int score = 70;
		String grade;
		switch(score) {
			case 100:
				grade = "A";
			case 80:
				grade = "B";
			default:
				grade = "D";
			case 60:
				grade = "C";		//변수는 마지막으로 대입된 값만 남는다.
			
		}
		System.out.println(grade);
	}
}
