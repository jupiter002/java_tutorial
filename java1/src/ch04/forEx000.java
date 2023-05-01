package ch04;
import java.util.Arrays;
import java.util.stream.IntStream;



public class forEx000 {
	public static void main(String[] args) {
		int n = 10;
		
		int[] arr = IntStream.rangeClosed(1,n).toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
