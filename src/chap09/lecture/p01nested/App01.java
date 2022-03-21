package chap09.lecture.p01nested;


public class App01 {
	public static void main(String[] args) {
		
		MyClass1 c1 = new MyClass1();
		MyClass1.NestedClass2 c2 = new MyClass1.NestedClass2();
		MyClass1.NestedClass1 c3 = c1.new NestedClass1();
		
		
	}

}
