package chap11.book.s111301Math;

public class MathExample {
	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);	// 절대값 
		double v2 = Math.abs(-3.14);	// 절대값 
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.ceil(5.3);		// 올림 
		double v4 = Math.ceil(-5.3);	// 올림 
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);
		
		double v5 = Math.floor(5.3);	// 내림 
		double v6 = Math.floor(-5.3);	// 내림 
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		int v7 = Math.max(5, 8);			// 두 값중에 큰 값 선택 
		double v8 = Math.min(5.3, 2.5);		// 두 값중에 큰 값 선택
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		int v9 = Math.min(5, 9);			// 두 값중 작은 값 선택 
		double v10 = Math.min(5.3, 2.5);	// 두 값중 작은 값 선택 
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		double v11 = Math.random();			// 0.0 ~ 1까지 랜덤 생성 
		System.out.println("v11 : " + v11);
		
		long v12 = Math.round(5.3);		// 반올림 
		long v13 = Math.round(5.3);		// 반올림 
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);
		
		
	}

}
