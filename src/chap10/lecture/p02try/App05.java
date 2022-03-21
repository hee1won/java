package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {

		int[] arr1 = null;

		try {
			int r = arr1[0] / arr1[1];
			System.out.println(r);

		} catch (NullPointerException e) {
			System.out.println("널포인터익셉션 발생");
		} catch (ArithmeticException a) {
			System.out.println("아리스메틱익셉션 발생");
		} catch (Exception b) {
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		}
		
		// catch 블럭 여러개 작성시 
		// 상위타입을 하위타입보다 아래에 작성 
		
		System.out.println("프로그램 계속 실행 ");
	}

}
