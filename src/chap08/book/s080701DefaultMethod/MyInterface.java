package chap08.book.s080701DefaultMethod;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("my interface 2 method2 실행");
	}
}
