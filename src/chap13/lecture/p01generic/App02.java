package chap13.lecture.p01generic;

public class App02 {
	public static void main(String[] args) {
		Container2 con2 = new Container2();
		con2.setContent("java");
		String str = (String) con2.getContent();
		
		Container2 con3 = new Container2();
		con3.setContent(1);		// auto boxing (int -> Integer)
		Object o1 = con3.getContent();
		Integer i1 = (Integer) o1;	// 위험 
	}

}

class Container2{
	private Object content;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
