package chap03.exercise;

public class Exercise06 {

	public static void main(String[] args) {
		// 사다리꼴의 넓이를 구하는 코드 정확히 소수자릿수가 나올 수 있도록 
		int lenghTop = 5;
		int lenghBottom = 10;
		int height = 7;
		double area = (lenghTop + lenghBottom) * height / 2.0;
		System.out.println(area);
	}

}
