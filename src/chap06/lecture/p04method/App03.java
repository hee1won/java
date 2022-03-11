package chap06.lecture.p04method;

public class App03 {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.execute("game");
		c1.execute("excel");
		
		c1.update("calculator");
		c1.update("window");
		
		c1.add(3, 5);
		c1.add(10, 20);
//		c1.add(3.14, 1.0);	메소드가 int 타입이기때문에 실행 오류 
		c1.add('c', 'd');	// char 타입은 자동 형변환이 되기때문에 가능 
		
	}

}
