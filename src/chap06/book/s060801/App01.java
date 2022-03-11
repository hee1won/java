package chap06.book.s060801;

public class App01 {
	
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 : " + result1);
		
		System.out.println(myCalc.plus(20,30));
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
		
	}

}
