package chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		mymethod();		// 메소드 호출 
		System.out.println("명령문2");
		mymethod();		// 메소드 호출 
		System.out.println("명령문3");
	}
	
	
	// 메소드 정의 
	public static void mymethod() {
		System.out.println("마이메소드1");
		System.out.println("마이메소드2");
		
		// 실행 순서는 순서대로 진행한다. 
	}
}
