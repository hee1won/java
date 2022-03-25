package chap13.exercise.Exercise02;

public class ContainerExample {
	public static void main(String[] args) {
		
		Container1<String> container1 = new Container1<String>();
		container1.setContent("홍길동");
		String str = container1.getContent();
		
		
		Container2<Integer> container2 = new Container2<Integer>();
		container2.setContent(6);
		int value = container2.getContent();
		
		
	}

}

class Container1<T>{
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}

class Container2<T>{
	private T content2;

	public T getContent() {
		return content2;
	}

	public void setContent(T content) {
		this.content2 = content;
	}
}
