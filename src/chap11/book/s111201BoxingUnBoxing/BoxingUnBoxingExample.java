package chap11.book.s111201BoxingUnBoxing;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// Boxing
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("200");
		Integer ob3 = new Integer("300");
		
		// Unboxing
		int value1 = ob1.intValue();
		int value2 = ob2.intValue();
		int value3 = ob3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}

}
