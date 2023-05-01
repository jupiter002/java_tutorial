package day05;
import java.util.Scanner;
public class array01 {
	public static void main(String[] args) {
		// array >> 순서 매김
		// 인덱스 0부터 시작
		// 인덱스에 해당하는 데이터 존재	class[0]="아무개", class[1]="김아무개"
		Scanner sc = new Scanner(System.in);
		
		
		int intArray[] = new int[5];
		int max=0;
		System.out.println("양수를 입력해주세요");
		for(int i=0; i<4; i++) {
			intArray[i] = sc.nextInt();
//			System.out.println(intArray[i]);
			
			if(max<intArray[i]) {
				max = intArray[i];
			}
					
		}System.out.println("가장 큰 숫자는 "+ max + "입니다.");
		
		sc.close();
	}
}
