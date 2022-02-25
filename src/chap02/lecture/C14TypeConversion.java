package chap02.lecture;

public class C14TypeConversion {
	public static void main(String[] args) {
		
		// 정수와 실수끼리 연산 결과 : 실수
		
		int i1 = 99;
		double d1 = 3.14;
		
		int i2 = (int)(i1 + d1); 	// double이 크기 때문에 강제 형 변환 해야함
		double d2 = i1 + d1;		// 가능 
		System.out.println(i2);
		System.out.println(d2);
		
		//
		
		int i3 = 7;
		int i4 = 2;
		
		int i5 = i3 / i4;
		System.out.println(i5);
		
		double d3 = i3 / i4;
		System.out.println(d3);
		
		
	}

}
