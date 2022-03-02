package chap04.lecture.forloop;

public class C07ForArrary {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 9, 7, 1, 2, 0};
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		// arrary 0번부터 5번까지 출력 
		
		System.out.println("for문 사용");
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// for문을 돌렸을 때 각 값을 두배로 
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] *= 2;
			System.out.println(arr1[i]);
		}
	}

}
