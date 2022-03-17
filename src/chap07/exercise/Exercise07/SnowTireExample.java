package chap07.exercise.Exercise07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowtire = new SnowTire();
		Tire tire = snowtire;
		
		snowtire.run();
		tire.run();
		
	}

}
