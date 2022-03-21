package chap09.book.s090203;

// 바깥 클래스 

public class A {
	
	A(){System.out.println("A 객체가 생성됨");}
	
	/** 인스턴스 멤버 클래스 **/
	
	class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
//		static int field2;
		void method1() {}
	}
	
	/** 정적 멤버 클래스**/
	
	static class C {
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	/** 로컬 클래스 **/
	
	void method() {
		class D {
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2{}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
