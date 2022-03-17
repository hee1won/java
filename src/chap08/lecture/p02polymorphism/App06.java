package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.*;

public class App06 {
	public static void main(String[] args) {

		Helper helper = new Retriever();

		helper.help();
//		helper.roll();

		Pet pet = (Pet) helper;
		pet.roll();
	}
}
