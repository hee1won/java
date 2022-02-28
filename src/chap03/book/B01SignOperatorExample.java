package chap03.book;

public class B01SignOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);	// +는 부호를 유지하
		System.out.println(result2);	// - 는 양수는 음수로 음수는 양수로 바뀐다. 
		
		short s = 100;
//		short result3 = -s;		// 부호연산자를 산출하면 결과는Int가 되므로 int로 바꿔줘야 한다.
		int result3 = s;
		
		System.out.println(s);
	}

}
