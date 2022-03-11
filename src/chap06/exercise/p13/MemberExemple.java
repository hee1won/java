package chap06.exercise.p13;

public class MemberExemple {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.name = "hong";
		m1.id = "gildong";
		m1.password = "dooly";
		m1.age = 33;
		
		Member m2 = new Member();
		m2.name = "noh";
		m2.id = "heewon";
		m2.password = "hi";
		m2.age = 25;
		
		System.out.println(m2.name);
		System.out.println(m2.password);

	}

}
