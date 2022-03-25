package chap13.book.s1302GenericType;

public class Box1Example {
	public static void main(String[] args) {
		
		Box1 box = new Box1();
		box.setObject("홍길동");							//  String > Object 자동 타입 변환 
		String name = (String) box.getObject();			//  Object > String 강제 타입 변환 
		
		box.setObject(new Apple());						// Apple > Object 자동 타입 변환 
		Apple apple = (Apple) box.getObject();			// Object > Apple 강제 타입 변환 
		
	}

}
