package chap04.lecture.forloop;

public class C01For {
	public static void main(String[] args) {
		System.out.println("stmt1");
		
		// 괄호()안 : 3개의 명령문 작성
		// 1번 : 초기값
		// 2번 : 조건식 
		// 3번 : 코드블럭 
		// 4번 : 증감식 
		
		// 실행순서 조건이true일 때 : 1번 -> 2번 true -> 3번 -> 4번 -> 2
		//		  조건이fasle일 때 : 1번 -> 2번 false -> 다음 실행 흐름(for문 종료)
		
		for(int i = 0;i < 3; i++) {
		System.out.println("stmt2");
		System.out.println("stmt3");
		}
		System.out.println("stmt4");
	}

}
