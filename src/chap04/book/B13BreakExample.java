package chap04.book;

public class B13BreakExample {

	public static void main(String[] args) {
		
		while(true) {
			
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 5) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
