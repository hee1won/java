package chap11.book.s110702StringMethod;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "    456   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
