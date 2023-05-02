package day05;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("과목명을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String course = sc.next();
		
		String a[] = {"java","c++","HTML5","컴퓨터구조","안드로이드"};
		int b[] = {95,88,76,62,55};
		for(int i=0; i<a.length; i++) {
			if(course.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			else if(course.equals(a[i])) {
				System.out.println(b[i]);
				break;
			}
			else if(!course.equals(a[i])) {
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
		
		sc.close();

	}
}
