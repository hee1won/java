package chap07.book.s0706.package2;
import chap07.book.s0706.package1.A;

public class D extends A{
	
	public D() {
		// A 클래스의 protected의 접근을 상속받아서 사용 가능 
		super();
		this.field = "value";
		this.method();
	}

}
