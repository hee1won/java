package chap02.book02;

public class B12FromIntToFloat {

	public static void main(String[] args) {
		
		// 정수type -> 실수type 변환
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	// 정확하게 하려면 double로 해야함 
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}
