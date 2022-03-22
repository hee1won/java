package chap11.book.s110301equals;

public class MemberExample {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("white");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1이랑 obj2랑 같습니다.");
		} else {
			System.out.println("obj1이랑 obj2랑 다릅니다.");
		}
		
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1이랑 obj3이랑 같습니다.");
		} else {
			System.out.println("obj1이랑 obj3이랑 다릅니다.");
		}
	}

}
