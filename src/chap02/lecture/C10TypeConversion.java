package chap02.lecture;

public class C10TypeConversion {

	public static void main(String[] args) {
		float f1 = 9000.1234F;
		double d1 = 12000000000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		// 형 변환 
		
		float f2;
		double d2;
		
		f2 = f1;	// ok
		d2 = f1;	// ok
		
		System.out.println(f2);
		System.out.println(d2);
		
		f2 = (float)d1;		// 강제 형 변환이 되지만 결과는 다를 수 있음 
		d2 = d1;
		
		System.out.println(f2);
		System.out.println(d2);
	}

}
