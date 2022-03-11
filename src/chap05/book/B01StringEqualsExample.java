package chap05.book;

public class B01StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "노희원";
		String strVar2 = "노희원";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.contentEquals(strVar2)) {		// 문자열을 비교하는 equals
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("노희원");
		String strVar4 = new String("노희원");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
			
			if(strVar3.equals(strVar4)) {
				System.out.println("strVar3과 strVar4는 문자열이 같음");
			}
		}

	}

}