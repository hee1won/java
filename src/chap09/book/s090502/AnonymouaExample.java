package chap09.book.s090502;

public class AnonymouaExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용
		anony.field.turnOn();

		// 익명 객체 로컬 변수 사용
		anony.method1();

		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv를 킵니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTv를 끕니다.");
			}
		});
	}

}
