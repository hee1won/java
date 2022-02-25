package chap03.lecture.binary;

public class C04Concatenate {

	public static void main(String[] args) {
		
		// +의 피연산자가 하나라도 String이면 연결연산자 
		
		String s1 = "hello";
		String s2 = "java";
		
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2;
		System.out.println(s3);
		
		int i1 = 9999;
		int i2 = 8888;
		System.out.println(i1 + i2);	// 정수끼리 더하면 산술연산 
		
		System.out.println(i1 + s1);	// String이 한번이라도 끼면 연결연산자가 된다. 
		
		String s4 = "8888";
		System.out.println(i1 + s4);	// String 연결연산자. 
		
		System.out.println(i1 + i2 + s1);	// 이 때는 앞에 i1 과 i2은 정수라 먼저 계산하고 그다음 hello가 연결된다. 
		System.out.println(s1 + i1 + i2);	// 이 때는 앞에 먼저 String이라서 처음부터 연결연산자가 된다. 
		

	}

}
