package chap03.lecture.method;

public class C04Method {

	public static void main(String[] args) {
//		myMethod();		// 파라미터를 두개 작성했기 때문에 무조건 두개 다 작성해야한다.
//		myMethod(3);		// 마찬가지로 두개의 파라미터를 다 작성해야한다.
		myMethod1(3, 5);
		myMethod1(33, 44);
		myMethod1('가', 33);
		
		myMethod2(999, 888);	// myMethod2에는 *2
		
	}
	
	
	// 파라미터명 : lowerCamelCase
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	public static void myMethod2(int age, int height) {
		System.out.println(age * 2);
		System.out.println(height * 2);
	}
	public static void myMethod3(int i, boolean b, long l, double d) {
	}
}
