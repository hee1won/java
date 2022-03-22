package chap06.lecture.p11annotation;

import java.lang.reflect.Method;

public class App01 {
	public static void main(String[] args) throws Exception {
		
		Class c1 = MyClass.class;
		
		Method method = c1.getDeclaredMethod("method2");
		
		System.out.println(method.isAnnotationPresent(MyAnnotation.class));
		
	}

}


@MyAnnotation
class MyClass{
	
	
	@MyAnnotation
	private String name;
	
	
	@MyAnnotation
	MyClass(){
		
	}
	
	@MyAnnotation
	void method(int param) {
		int i;
	}
	@MyAnnotation
	void method2() {
		
	}
}
