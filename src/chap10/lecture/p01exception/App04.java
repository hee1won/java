package chap10.lecture.p01exception;
import chap08.lecture.p01interface.Animal;
import chap08.lecture.p01interface.Cat;

public class App04 {
	public static void main(String[] args) {
		// ClassCastException
		
		Animal animal = new Cat();
		
//		Chihuahua chihuahua = (Chihuahua) animal;	// Exception
		
		System.out.println("프로그램 계속 실행");
		
		
	}

}
