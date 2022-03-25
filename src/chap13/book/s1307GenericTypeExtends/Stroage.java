package chap13.book.s1307GenericTypeExtends;

public interface Stroage <T>{
	
	public void add(T item, int index);
	public T get(int index);

}
