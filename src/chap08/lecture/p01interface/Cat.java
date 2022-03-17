package chap08.lecture.p01interface;

public class Cat extends Feline implements Pet {
	public void cry() {
		System.out.println("야옹");
	}
	
	public void roll() {
		System.out.println("고양이가 무시합니다.");
	}
	
	// interface의 default method 재정의 가능.
	public void sit() {
		System.out.println("고양이가 도망갑니다.");
	}

}
