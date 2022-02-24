package chap02.lecture;

public class C03LiteralValue {

	public static void main(String[] args) {
		// 정수 literal
		
		System.out.println(1);
		System.out.println(109);
		System.out.println(10);
		System.out.println(15);
		System.out.println(123);
		
		// 실수 literal
		
		System.out.println(1.2);
		System.out.println(5.231);
		System.out.println(0.1);
		
		// 문자 literal 한글자는 '' 작은 따옴표 
		System.out.println('a');
		System.out.println('b');
		System.out.println('A');
//		System.out.println('AB');
//		System.out.println('');
		System.out.println('가');
		System.out.println('0');
		System.out.println();		// 공
		System.out.println('나');
		
		// 문자열 literal 여러글자는 "" 큰 따옴표 
		System.out.println("");
		System.out.println("A");
		System.out.println("ABC");
		System.out.println("가나다");
		System.out.println("Hello WORLD");
		System.out.println("Hello\tWorld"); // \t는 공백(탭)
		System.out.println("Hello\nWorld"); // \n은 다음
		System.out.println("i am \"iroman\""); // \"
		System.out.println("backslash \\"); // \
		
		// 논리(boolean) literal (true, false)
		System.out.println(true);
		System.out.println(false);
	}

}
