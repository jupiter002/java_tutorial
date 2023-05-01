package ch04;

public class continueEx02 {
	public static void main(String[] args) {
		//짝수만 출력
		for(int a=1; a<11; a++) {
			if(a%2 != 0) {	//홀수 검출 조건식
				continue;	//홀수 출력 안함.
			}
			System.out.print(a+" ");	// print에서 ln은 줄바꿈
		}
		//홀수만 출력
		for(int a=1; a<11; a++) {
			if(a%2 == 0) {
				continue;
			}
			System.out.print(a+" ");
		}
		
	}
}
