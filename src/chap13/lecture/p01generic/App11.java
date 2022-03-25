package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.Canine;
import chap08.lecture.p01interface.Cat;
import chap08.lecture.p01interface.Pet;

public class App11 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<>();
		ArrayList<Canine> list2 = new ArrayList<>();
		ArrayList<Cat> list3 = new ArrayList<>();
		
		method(list1);
		method(list2);
		method(list3);
		
	}
	
	// "in" variable : extends
	// "out" variable : super
	// "in" object : ?
	// "in", "out" : x
	
	// 상하위 타입 그림 
	public static void method(ArrayList<?> list) {
		Object o = list.get(0);
		;
	}
	
	public static void method2(ArrayList<Cat> list) {
		list.add(new Cat());
		Cat cat = list.get(0);
	}
}
