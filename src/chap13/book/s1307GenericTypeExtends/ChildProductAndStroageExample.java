package chap13.book.s1307GenericTypeExtends;

import chap13.book.s1303MultiTypeParameter.Tv;

public class ChildProductAndStroageExample {
	public static void main(String[] args) {
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart Tv");
		product.setCompany("Samsung");
		
		Stroage<Tv> stroage = new StroageImpl<Tv>(100);
		stroage.add(new Tv(), 0);
		Tv tv = stroage.get(0);
		
	}

}
