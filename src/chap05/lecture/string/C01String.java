package chap05.lecture.string;

public class C01String {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);	// false 참조값 비교 (디버깅을 활용하면 확인 가능)
		
		System.out.println(s1.equals(s2));	// equals는 안에 내용물 비교 
		
		
		String s3 = "java";
		String s4 = "java";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);
	}

}
