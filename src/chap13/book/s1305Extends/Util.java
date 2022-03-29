package chap13.book.s1305Extends;

public class Util {
	public static <T extends Number> int Compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t1.doubleValue();
		
		return Double.compare(v1, v2);
	}

}