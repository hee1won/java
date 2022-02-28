package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod(300);
		myMethod(900);
//		myMethod(3.14);		int 타입이라 불가능 
		myMethod('가');		// char은 int 타입으로 자동 형변환이 됨. 
		
		int j = 999;
		myMethod(j);
	}
	public static void myMethod(int i) {
		System.out.println(i);
	}

}
