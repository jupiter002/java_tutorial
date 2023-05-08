package day09;

import java.util.*;


class Student02{
	// 속성으로 name,id,department, grade를 가진다
	// getter, setter 둘다 만듬
	// 모든 속성을 매개변수로 가지는 생성자 만듬
	private String name,id,department;
	private double grade;
	
	public Student02(String name, String id, String department, double grade) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student02 [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}
	
	
	
	
}
public class studentHashMap {
	public static void main(String[] args) {
		HashMap<String,Student02> studentMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		studentMap.put("아무개1",new Student02("a","1","R",3.0));
		studentMap.put("아무개2",new Student02("b","2","RUST",3.1));
		studentMap.put("아무개3",new Student02("c","3","JS",4.1));
		studentMap.put("아무개4",new Student02("d","4","PHP",3.5));
		
		Set<String>keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		
//		for(Map.Entry<String, Student02>item:studentMap.entrySet()) {
//		System.out.println(item.getKey()+" : "+ item.getValue);
		
		
		while(it.hasNext()) {
			String name = it.next();
			Student02 student = studentMap.get(name);
			System.out.println(student);
		}
		
		// iterator 통해서 반복문 만들어 보기...
		// 이름을 입력했을때 출력해보기.
		while(true) {
			System.out.println("학생이름을 입력하세요.");
			String name = sc.next();
			if(name.equals("exit")) {
				break;
			}
			Student02 student = studentMap.get(name);
			System.out.println(student.getName()+" / ");
			System.out.println(student.getId()+" / ");
			System.out.println(student.getDepartment()+" / ");
			System.out.println(student.getGrade()+" / ");
			
		}
		
		
		
	}

}
