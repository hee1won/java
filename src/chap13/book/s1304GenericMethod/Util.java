package chap13.book.s1304GenericMethod;

import chap13.book.s1302GenericType.Box;

public class Util {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

}
