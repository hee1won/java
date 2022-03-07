package chap05.lecture.array;

public class C07Array {

	public static void main(String[] args) {
		
		int[][] arr1 = {{ 3, 5 }, { -2, -7 }, { 10, 30 }};
		int[][] arr2 = arr1;
		
		arr1[0][1] = 50;
		
		System.out.println(arr2[0][1]);
		// arr1과 arr2는 같은 참조값을 가지고있어서 arr1의 0번째의 1번째값을 바꿔도 arr2도 같이 바뀐다. 
		
		arr2[1] = new int[] {300, 200, 100};
		System.out.println(arr2[1][0]);	// 300
		System.out.println(arr1[1][0]);	// 300
		
	}

}
