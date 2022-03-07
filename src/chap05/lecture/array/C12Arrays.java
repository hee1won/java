package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {

	public static void main(String[] args) {
		int[] a = {-1, 9, 2, 3, 10};
		System.out.println(a);	// 참조주소 출력 
		System.out.println(Arrays.toString(a));		// a 배열의 내용 출력 
		
		Arrays.sort(a);		// a 배열 오름차순으로 정렬 
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[10];
//		for(int i = 0; i < b.length; i++) {
//			b[i]=5;
//		}
		Arrays.fill(b, 5); 	// b배열 안의 값을 5로 채워둠 
		
		System.out.println(Arrays.toString(b));
		
	}

}
