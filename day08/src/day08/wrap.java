package day08;
import java.util.Scanner;


public class wrap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = Character.toLowerCase('A');
		System.out.println(ch);
		char ch01='a';
		char ch02='4';
		System.out.println(Character.isDigit(ch01));
		System.out.println(Character.isDigit(ch02));
		
		System.out.println(Character.isAlphabetic(ch01));
		System.out.println(Character.isAlphabetic(ch02));
		
		 
		
		int age = Integer.parseInt("20");
		if(age>20) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println();
		}
		
		int num=20;
		Integer objnum = num;
		int unboxingnum = objnum+10;
		System.out.println(unboxingnum);
		String str = Integer.toString(unboxingnum);
		System.out.println(str.equals("30"));
		
	}
}
