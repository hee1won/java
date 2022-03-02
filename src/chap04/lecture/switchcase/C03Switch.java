package chap04.lecture.switchcase;

public class C03Switch {

	public static void main(String[] args) {
		
		// default : 일치하는 case가 없을 때 실행 
		
		switch(1) {
		case 1 :
			System.out.println("stmt1");
			break;
		case 2 :
			System.out.println("stmt2");
			break;
		default:
			System.out.println("stme3");
			break;
		}
	}

}
