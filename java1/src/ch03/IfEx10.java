package ch03;

public class IfEx10 {
	public static void main(String[] args) {
		int score = 97;
		String result="";
		
		if(score>91) {
			if(score>96) {
				result="A+";
			}
			else {
				result="A";
			}
		}
		System.out.println(result);
		
		
		// result 오류나는 이유
		// if문이 false일때의 값이 없기때문에result의 초기화가 필요
		//String에선 ""공백도 문자다.
		
		
	}

}
