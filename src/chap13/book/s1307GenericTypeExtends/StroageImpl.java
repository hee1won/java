package chap13.book.s1307GenericTypeExtends;

public class StroageImpl <T> implements Stroage<T>{
	
	private T[] array;
	
	public StroageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
