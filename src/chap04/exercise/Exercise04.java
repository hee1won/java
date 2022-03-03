package chap04.exercise;

public class Exercise04 {

	public static void main(String[] args) {

		// 예제3 주사위를 던졌을때 눈이 합이 5가 아니면 계속 던지고 눈의 합이 5이면 실행을 멈추는 코드

		boolean more = true;
		while (more) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println("(" + a + "," + b + ")");
			if ((a + b) == 5) {
				return;
			}
		}

	}

}
