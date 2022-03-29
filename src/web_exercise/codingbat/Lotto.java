package web_exercise.codingbat;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
	}

}
