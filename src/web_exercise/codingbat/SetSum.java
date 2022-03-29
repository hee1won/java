package web_exercise.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetSum {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(95,86));
		list.add(Arrays.asList(83,92, 96));
		list.add(Arrays.asList(78,83, 93, 87, 88));
		
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		
		for(List<Integer> lsum : list) {
			for(Integer bsum : lsum) {
				sum += bsum;
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println((double)sum/cnt);
	}

}
