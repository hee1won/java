package chap10.exercise;

public class Exercise05 {

	public void method1() throws NumberFormatException, ClassNotFoundException {

	}

	public void ex01() {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void ex02() throws Exception{
		method1();
	}
	
//	public void ex03() {
//		try {
//			method1();
//		} catch (Exception) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public void ex04() {
		try {
			method1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void ex05() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void ex06() throws ClassNotFoundException{
		method1();
	}
}
