package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		
		// 논리연산자 
		// &&(AND short circuit), ||(OR short circuit)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean
		
		
		// AND &&
		// 양변 모두 true 일 때만 true, 나머지 모두 false
		System.out.println("AND &&");
		System.out.println(true && true);		// true
		System.out.println(true && false);		// false
		System.out.println(false && true);		// false
		System.out.println(false && false);		// false
		
		// OR ||
		// 양변 모두 false일 때만 false, 나머지 모두 true
		System.out.println("OR ||");
		System.out.println(true || true);		// true
		System.out.println(true || false);		// true
		System.out.println(false || true);		// true
		System.out.println(false || false);		// false
		
		// short circuit	// 앞 항만 보고 뒤에 항을 계산할 필요가 없는 경우 
		int i = 3;
		System.out.println((i > 0) && (i++ > 0));	// true
		System.out.println(i);
		System.out.println((i < 0) && (i++ < 0));	// false	// 단락 (short circuit)
		System.out.println(i);
		
		System.out.println((i < 0) || (i++ < 0));	// false	// 단락  
		System.out.println(i);						//	계산이 실행되지 않는다.
		System.out.println((i > 0) || (i++ > 0));	// true		// 단락 
		
		System.out.println((i > 0) & (i++ > 0));	// & 하나일 때는 판단을 한다.
		System.out.println(i);
		
		System.out.println((i < 0) & (i++ < 0));	// short circuit이 일어나지 않는다.
		System.out.println(i);
		
		// ^ (XOR)
		// 양변이 다를 때만 true, 같으면 false
		System.out.println("XOR ^");
		System.out.println(true ^ true);	// false
		System.out.println(true ^ false);	// true
		System.out.println(false ^ true);	// true
		System.out.println(false ^ false);	// false
		
		int x = 10;
		int y = 5;
		
		
	}

}
