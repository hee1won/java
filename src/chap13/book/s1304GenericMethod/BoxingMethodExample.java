package chap13.book.s1304GenericMethod;

import chap13.book.s1302GenericType.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.getT();
		
		Box<String> box2 = Util.boxing("홍길동");
		String str = box2.getT();
	}

}
