package instance;

class Person {}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}
class StudentWorker extends Student{}

// 생성자 오버로드
// 메서드 오업로드
// 메서드 오버라이드


public class instanceTest {
	
	static void print(Person person) {
		if(person instanceof Person) System.out.println("person입니다.");
		if(person instanceof Student) System.out.println("student입니다.");
		if(person instanceof Researcher) System.out.println("researcher입니다.");
		if(person instanceof Professor) System.out.println("professor입니다.");
		if(person instanceof StudentWorker) System.out.println("studentworker입니다.");
	}	
	
	public static void main(String[] args) {
		print(new StudentWorker());
	}
}
