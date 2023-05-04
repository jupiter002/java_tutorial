package day08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyWord {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println(">>");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		if(str.equals("exit")) {
			System.out.println("종료합니다");
			break;
			}
		else {
			System.out.println(st.countTokens()+"개 입력하였습니다");
			}
		}
	}
}
