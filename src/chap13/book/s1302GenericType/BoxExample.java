package chap13.book.s1302GenericType;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.setT("hello");
		String str = box1.getT();
		
		Box<Integer> box2 = new Box<>();
		box2.setT(6);
		int value = box2.getT();
		
	}

}
