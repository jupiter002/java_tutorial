package day09;
import java.util.*;
class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}



public class StudentMap {
	public static void main(String[] args) {
		
	
	HashMap<String,Student> studentmap = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	studentmap.put("아무개",new Student(1,"010-1111-1111"));
	studentmap.put("최아무개", new Student(2,"010-2222-2222"));
	studentmap.put("김아무개", new Student(3, "010-3333-3333"));
	studentmap.put("이아무개", new Student(4, "010-4444-4444"));
	
	while(true) {
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		if(name.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		Student student = studentmap.get(name);
		if(student==null) {
			System.out.println("이름을 다시 입력해주세요.");
		}
		else {
			System.out.println(name+" id : "+student.getId()+"===tel"+student.getTel());
		}
		
	}
	sc.close();
	
	}
}
