package day06;

public class bookTest {

	public static void main(String[] args) {
		book harry  = new book("해리포터","조앤롤링");
		System.out.println(harry.author);
		System.out.println(harry.title);	
	
	book java = new book("java 코딩");
	System.out.println(java.author);
	System.out.println(java.title);
	book untitle = new book("r","z");
	untitle.showInfo();

	book myBook = harry;
	harry.author="san thekkjjiber";
	myBook.author="장성호";
	
	System.out.println(harry.author);
	System.out.println(myBook.author);
	// 기본 타입이 아닌 변수들은 참조를 한다. 복사하지 않음
	
	
	int arr01[]= {1,2,3};
	int arr02[]=arr01;
	arr02[1] = 200;
	System.out.println(arr01[1]);
	
	
	}
}