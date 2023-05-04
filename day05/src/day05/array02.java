package day05;

public class array02 {
	public static void main(String[] args) {
//		int nums[] = {1,3,4,5,56,6,7};
//		System.out.println(nums.length);
//		int total = nums.length;
//		int sum = 0;
//		for(int i=0; i<total; i++) {
//			sum+=nums[i];
//		}
//		System.out.println(sum);
//		System.out.println((double)sum/total);
//		
//		
//		
//		// for=each
//		int sum02 = 0;
//		for(int j : nums) {
//			sum02+=j;
//		}
//		System.out.println(sum02);
//		
//		String fruits[] = {"과일,과일,과일,과일"};
//		for(String fruit : fruits) {
//			System.out.print(fruit);
//			}
//		int intArray[][] = new int[2][3];
//		intArray[0][0] = 1;
//		intArray[0][1] = 2;
//		intArray[0][2] = 3;
//		
//		intArray[1][0] = 100;
//		intArray[1][1] = 200;
//		intArray[1][2] = 300;
//		
//		intArray[2][0] = 500;
//		intArray[2][1] = 700;
//		intArray[2][2] = 900;
//		
//		for(int i=0; i<intArray.length; i++) {
//			for(int j=0; j<intArray[i].length; j++) {
//				System.out.println(intArray);
//			}
//		}
		String animals[] = {"puppy", "cat", "lion", "tiger"};
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println();
		for(String animal : animals) {
			System.out.print(animal+" ");
		}
		
		int n[]= {3,5,6,7,8,14,37,64,87,90};
		for(int i=0; i<n.length;  i++) {
			if(n[i]%3==0) {
				System.out.println(n[i]);
			}
		}
	
		
		
	}
	}