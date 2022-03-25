package chap13.lecture.p01generic;

import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App04 {
	public static void main(String[] args) {
		
		Container4<String> o1 = new Container4<String>();
		Container4<Integer> o2 = new Container4<Integer>();
		
		// 기본타입은 type parameter로 사용 불가 
		// 8개 wrapper class 이용 (auto boxing, unboxing)
		
		Container4<Chihuahua> o3 = new Container4<>();	// type parameter 생략 가능 (diamond)
		
	}

}

class Container4<T>{
	public void method(T param) {
		
	}
}
