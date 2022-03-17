package chap07.book.s070402;

public class SonicAirplane extends Airplane{
	
	public static final int NOMAL = 1;
	public static final int SUPER = 2;
	
	public int flyModel = NOMAL;
	
	@Override
	
	public void fly() {
		if(flyModel == SUPER) {
			System.out.println("초음속 비행 합니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출 
			super.fly();
 		}
	}

}
