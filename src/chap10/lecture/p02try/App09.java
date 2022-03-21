package chap10.lecture.p02try;

public class App09 {
	public static void main(String[] args) {
		// finaly : 예외(Exception) 발생여부 관계없이 항상 실행되는 코드블럭 
		String a = null;
//		String s = "java";
		
		try {
			System.out.println(a.length());
			
			System.out.println("try block 실행 계속...");
		} catch (NullPointerException d) {
			System.out.println("널포인터 익셉션 발생 ");
		} finally {
			// 마지막에 작성 
			System.out.println("항상 실행되는 finally block");
		}
		
		System.out.println("프로그램 실행 계속");
		
	}

}
