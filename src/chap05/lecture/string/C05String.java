package chap05.lecture.string;

public class C05String {

	public static void main(String[] args) {
		
		// replaceAll (regex, replacement)
		// 첫번째 파라미터 패턴에 맞는 스트링을 
		// replacement(두번째파라미터)로 변경 
		
		String s1 = "java1234Script";
		String s2 = s1.replace("a", "z");	// s1의 a를 z로 변경 
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = s1.replaceAll("[0-9]", "*");	// s1의 숫자1234를 패턴 0-9까지 *로 변경 
		System.out.println(s3);
		String s4 = s1.replaceAll("[a-zA-z]", "*");		// s1의 글자 java Script 를 영어 소문자 a-z 대문자 A-Z 패턴을 이용해 *로 변경 
		System.out.println(s4);

	}

}
