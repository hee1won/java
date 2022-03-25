package chap08.book.s080506InstanceOf;
import chap08.book.s080504.*;
import chap08.book.s080505Casting.Bus;
import chap08.book.s080505Casting.Vehicle;
public class Driver {
	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
		
	}

}
