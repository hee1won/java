package chap05.lecture.array;

import java.util.Arrays;

public class C11ArrayCopy {

	public static void main(String[] args) {
		
		int[] a = {9, 5, 2, 1};
		int[] b = new int [a.length];
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		int [] c = Arrays.copyOf(a, a.length);		// 첫번째 : 원본, 두번째 : 길이 
		int [] d = new int[a.length];
		System.arraycopy(a, 0, d, 0, a.length);		// 첫번째 : 원본, 두번째 : 원본의 시작 위치, 세번째 : 복사본, 네번째 : 복사본 시작 위치, 다섯번째 : 길이 
		
		System.out.println(d);
	}

}
