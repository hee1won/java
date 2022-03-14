package chap06.book.s061401;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		
		// 잘못된 속도 변경 
//		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar1.getSpeed());
		
		// 올바른 속도 변경 
		myCar1.setSpeed(60);
		
		// 멈춤
		if(!myCar1.isStop()) {
			myCar1.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar1.getSpeed());
		
	}
}
