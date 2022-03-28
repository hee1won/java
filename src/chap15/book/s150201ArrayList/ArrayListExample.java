package chap15.book.s150201ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		// String 객체를 저장 
		list1.add("Java");
		list1.add("JDBC");
		list1.add("Servlet/JSP");
		list1.add(2,"database");
		list1.add("iBATIS");
		
		// 저장된 총 객체 수 얻기 
		int size = list1.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기 
		String skill = list1.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑 
		for(int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		// 2번 인덱스 객체 
		list1.remove(2);	// 2번 인덱스 "JDBC" 삭제됨.
		list1.remove(2);	// 2번 인덱스 "Servlet/JSP" 삭제됨.
		list1.remove("iBATIS");		// "iBATIS" 삭제됨.
		
		// 저장된 총 객체 수만큼 루핑 
		for(int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
