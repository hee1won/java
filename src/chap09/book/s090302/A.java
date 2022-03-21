package chap09.book.s090302;

public class A {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
	}
	
	static class C{
		void method() {
//			field1 = 10;	// 인스턴스 필드와는 접근 불가능 
			field2 = 20;
//			method1();		// 인스턴스 메소드와는 접근 불가능 
			method2();
		}
	}

}
