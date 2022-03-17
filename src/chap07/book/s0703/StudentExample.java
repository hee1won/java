package chap07.book.s0703;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "19-73019855", 5);
		System.out.println("name : " + student.name);	// 물려받은 필드 출력 
		System.out.println("ssn : " + student.ssn);		// 물려받은 필드 출력 
		System.out.println("studentNo : " + student.studentNo);
	}

}
