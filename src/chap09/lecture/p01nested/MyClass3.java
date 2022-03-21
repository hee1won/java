package chap09.lecture.p01nested;

public class MyClass3 {
	// static 멤버 에서는 instance 멤버에 접근할 수 없다.
	
	
	// static 중첩 클래스 
	static class NestedClass1{
		
	}
	
	// instance 중첩클래스 
	class NestedClass2{
		
	}
	
	// instance 메소드 
	void method1() {
		MyClass3.NestedClass1 o1 = new MyClass3.NestedClass1();
		NestedClass1 o2 = new NestedClass1();
		// MyClass3 생략 가능 
		
		NestedClass2 o3 = new NestedClass2();
	}
	
	// static 메소드 
	
	static void method2() {
		NestedClass1 o1 = new NestedClass1();
//		NestedClass2 o2 = new NestedClass2();
	}
	
	// instance 필드 
	NestedClass1 field1 = new NestedClass1();
	NestedClass2 field2 = new NestedClass2();
	
	// static 필드 
	static NestedClass1 filed3 = new NestedClass1();
//	static NestedClass2 field4 = new NestedClass2();	xxx
	
	
}
