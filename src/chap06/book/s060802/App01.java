package chap06.book.s060802;

public class App01 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.setGas(0);	// Car의 setGas 메소드 호출 
		
		boolean gasState = c1.isLeftgas();	// Car의 isLeftgas 메소드 호출 
		if(gasState) {
			System.out.println("출발합니다.");
			c1.run();	// run 메소드 호출 
		}
		
		if(c1.isLeftgas()) {	// Car의 isLeftgas 메소드 호출 
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
