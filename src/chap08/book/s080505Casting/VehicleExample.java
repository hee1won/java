package chap08.book.s080505Casting;

public class VehicleExample {
	public static void main(String[] args) {
		
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();	// Vehicle 인터페이스에 checkFare가 없음 
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}

}
