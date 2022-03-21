package chap09.lecture.p01nested;

public class MyClass2 {
	// static멤버에서 instance 멤버에 접근 할 수 없다.
	
	// static 중첩 클래스 
	static class NestedClass1{
		// 필드 
		int field1;
		static int field2;
		static final int FIELD3 = 3;
		// 생성자
		// 메소드 
		void method1() {}
		static void method2() {
			
		}
	}
	
	// instance 중첩 클래스 
	
	class NestedClass2{
		// 필드 
		int field1;
//		static field2;	// static field 가질 수 없음 
		// 생성자 
		// 메소드 
		void method1() {}
//		static void method2() {}	// static method 가질 수 없음 
	}

}
