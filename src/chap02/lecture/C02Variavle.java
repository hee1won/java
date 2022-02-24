package chap02.lecture;

public class C02Variavle {

	public static void main(String[] args) {
		// 변수의 사용 범위(scope) : 선언된 블럭{} 안
		
		boolean b = true;
		
//		int a = 4;
		if(b) {
			int a = 3;
			System.out.println(a);
		}
//		System.out.println(a);    a는 코드블럭 안에서만 사용 할 수 있음.

	}

}
