package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		myMethod(300);
		System.out.println("명령문2");
		myMethod(5);
		System.out.println("명령문3");
	}
	
	
	// 메소드명 : lowerCamelCase
	// ()에 파라미터타입과 파라미터이름 작성 가능 
	// -> 파라미터 
	public static void myMethod(int i) {
		System.out.println("마이 메소드1");
		System.out.println("파라미터 i의 값 : " + i);
	}
}
