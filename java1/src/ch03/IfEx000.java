package ch03;

public class IfEx000 {
 public static void main(String[] args) {
	 int a = 91;
	 if (a>=90) {
		 System.out.println("점수는"+ a + "점입니다.");
		 System.out.println("학점은 A입니다.");
	 }
	 else if (a>=80) {
		 System.out.println("점수는"+ a + "점입니다");
		 System.out.println("학점은 B입니다.");
	 }
	 else if (a>=70) {
		System.out.println("점수는"+ a + "점입니다.");
		System.out.println("학점은 C입니다.");
	 }
	 else if (a>=60) {
		 System.out.println("점수는"+ a + "점입니다.");
		 System.out.println("학점은 D입니다.");
	 }
	 else {
		 System.out.println("점수는"+ a + "점입니다");
		 System.out.println("학점은 F입니다.");
	 }
 }
}
