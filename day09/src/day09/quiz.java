package day09;
import java.util.*;



class Student12{
	// 속성으로 name,id,department, grade를 가진다
	// getter, setter 둘다 만듬
	// 모든 속성을 매개변수로 가지는 생성자 만듬
	private String name,id,department;
	private double grade;
	
	public Student12(String name, String id, String department, double grade) {
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
	
	
}
public class quiz {
	public static void main(String[] args) {
		ArrayList<Student12> studentList = new ArrayList<>();
		studentList.add(new Student12("a","1","R",3.0));
		studentList.add(new Student12("b","2","RUST",3.1));
		studentList.add(new Student12("c","3","JS",4.1));
		studentList.add(new Student12("d","4","PHP",3.5));
		
		

		
		Iterator<Student12> stu =  studentList.iterator();
		while(stu.hasNext()) {
			Student12 studnet = stu.next();
			System.out.println(studnet.getName());
			System.out.println(studnet.getId());
			System.out.println(studnet.getDepartment());
			System.out.println(studnet.getGrade());
			System.out.println("-----------------");
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("학생이름을 입력하세요.");
			String name = sc.next();
			if(name.equals("exit"))break;
				for(int i=0;i<studentList.size(); i++) {
					Student12 student = studentList.get(i);
					if(student.getName().equals(name)) {
						System.out.print(student.getName()+"/");
						System.out.print(student.getId()+"/");
						System.out.print(student.getDepartment()+"/");
						System.out.println(student.getGrade()+"");
				
			}
		}
		}
//		System.out.println(stu.next());
//		System.out.println(stu.next());
//		System.out.println(stu.next());
//		System.out.println(stu.next());
		 
		
		
	
	
	
}
}
