package chap05.lecture.array;

import java.util.Arrays;

public class C16ArrayCopy {

	public static void main(String[] args) {
		
		// 그림 : 참조타입 08
		
		int[][] a = { { 9, 10 }, { 3, 4 } };
		int[][] c = new int[a.length][];
		
		/*
		 * c[0] = Arrays.copyOf(a[1], a[1].length); 
		 * c[1] = Arrays.copyOf(a[0], a[0].length);
		 */
		for(int i = 0; i < a.length; i++) {
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}
		
		c[0][0] = 999;
		System.out.println(a[0][0]);
		System.out.println(c[0][0]);
	}

}
