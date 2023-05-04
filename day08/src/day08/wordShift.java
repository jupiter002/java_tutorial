package day08;

import java.util.Scanner;

public class wordShift {

	public static String shift(String s) {
		return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
	}
	
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		for(int i = 0; i<=str.length(); i++) {
//			System.out.println(str);
//			str = shift(str);
//		}
		int total = str.length();
		for(int i=0; i<total; i++) {
			String first = str.substring(0, 1);
			String rest = str.substring(1);
			str=rest + first;
			System.out.println(str);
		}
		
		
	}
}
