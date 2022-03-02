package chap04.book;

public class B04IfDiceExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1;	// random은 0.0~1까지 나타난다.
											// 거기다 *6을 줘서 0.0~6.0까지 나타난다.
											// Int라서 정수만 0~6까지 나타남
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
