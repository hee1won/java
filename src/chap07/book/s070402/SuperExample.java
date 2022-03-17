package chap07.book.s070402;

public class SuperExample {
	public static void main(String[] args) {
		
		SonicAirplane s = new SonicAirplane();
		
		s.takeOff();	// 이륙합니다.
		s.fly();	// 일반비행합니다.
		s.flyModel = SonicAirplane.SUPER;	// 값을 초음속으로 바꿈.
		s.fly();	// 초음속비행합니다.
		s.flyModel = SonicAirplane.NOMAL;	// 값을 일반으로 다시 바꿈.
		s.fly();	// 일반비행합니다.
		s.land();	// 착륙합니다.
		
		
	}

}
