package chap07.book.s070402;

public class SuperExample {
	public static void main(String[] args) {
		
		SonicAirplane s = new SonicAirplane();
		
		s.takeOff();	// 이륙합니다.
		s.fly();	// 일반비행합니다.
		s.flyModel = SonicAirplane.SUPER;
		s.fly();	// 일반비행합니다.
		s.flyModel = SonicAirplane.NOMAL;
		s.fly();	// 일반비행합니다.
		s.land();	// 착륙합니다.
		
		
	}

}
