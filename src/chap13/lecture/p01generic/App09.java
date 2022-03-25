package chap13.lecture.p01generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import chap08.lecture.p01interface.Cat;
import chap08.lecture.p01interface.Chihuahua;
import chap08.lecture.p01interface.Pet;

public class App09 {
	public static void main(String[] args) {
		
		ArrayList<Pet> list1 = new ArrayList<>();
		list1.add(new Chihuahua());
		method(list1);
		
		ArrayList<Chihuahua> list2 = new ArrayList<>();
		list2.add(new Chihuahua());
		method(list2);
		
		ArrayList<Cat> list3 = new ArrayList<>();
		list3.add(new Cat());
		method(list3);
		
	}
	
	
	// ? : wild card 
	public static void method(ArrayList<? extends Pet> param) {
		param.get(0).roll();	// Pet의 roll 메소드
	}
	
}
