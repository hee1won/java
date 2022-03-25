package chap05.lecture.array;

public class C01EnhancedFor {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("그냥 for");
		}
		
		int[] arr1 = {100, 200, 300, 400};
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);	// for문 배열 탐색 
		}
		
		for(int item : arr1) {
			System.out.println(item);			// 배열 탐색 
			System.out.println("코드 반복!!");		// 아이템의 갯수만큼 반복 
		}

	}

}
