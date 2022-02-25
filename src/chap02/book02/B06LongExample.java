package chap02.book02;

public class B06LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000000;	// 컴파일 에러 : longType은 뒤에 l(L)을 붙혀야 한다.
		long var4 = 1000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);

	}

}
