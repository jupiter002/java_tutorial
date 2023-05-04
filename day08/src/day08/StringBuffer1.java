package day08;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("this");
		str.append(" is a pencil");
		str.insert(7, " my");
		System.out.println(str);
		str.replace(8, 10, "your");
		System.out.println(str);
		str.delete(8, 13);
		System.out.println(str);
		str.setLength(11);
		System.out.println(str);
		
	}

}
