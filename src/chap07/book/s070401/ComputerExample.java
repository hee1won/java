package chap07.book.s070401;

public class ComputerExample {
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator a = new Calculator();
		System.out.println("원면적 : " + a.areaCircle(r));
		System.out.println();
		
		Computer b = new Computer();
		System.out.println("원면적 : " + b.areaCircle(r));	// 재정의된 메소드 호출 
		
	}

}
