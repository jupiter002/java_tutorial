package day09;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(5);
		vec.add(3);
		vec.add(1);
		
		vec.add(2, 100);
		
//		System.out.println(vec);
//		System.out.println(vec.get(2));
//		for(int i=0; i<vec.size(); i++) {
//			System.out.print(vec.get(i)+" ");
//		}
		System.out.println(vec.capacity());
			for(int num:vec) {
				System.out.print(num+" ");
			}
	}
}
