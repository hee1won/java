package chap03.exercise;

public class Exercise05 {

	public static void main(String[] args) {
		
		// value = 356이 300이 되도록 십의 자리 이하를 버리는 코드 
		
		int value = 356;
		System.out.println(value - 56);
		System.out.println(value / 100 * 100);
		System.out.println(value - (value % 100));

	}

}
