package chap06.book.s061101;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";
		System.out.println(p1.name);

	}

}
