package chap06.book.s061101;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;	// final은 대문자로 
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	

}
