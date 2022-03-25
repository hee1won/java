package chap13.book.s1305Extends;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		
		// String str = Util.compare("a", "b");  	xx	String은 Number타입이 아님 
		
		int result1 = Util.Compare(10, 20);	// int -> Integer로 자동 boxing
		System.out.println(result1);
		
		int result2 = Util.Compare(4.5, 3);	// double -> Double 자동 boxing
		System.out.println(result2);
	}

}
