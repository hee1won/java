package chap05.lecture.array;

public class C05Array {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 5, 1};
		int[] arr2 = arr1;
		
		arr2[0] = 30;
		
		System.out.println(arr1[0]);
		
		// arr1과 arr2는 같은 참조변수를 가지고 있어서 arr2 0번째 값을 30으로 바꿔도 arr1의 0번째값도 30으로 바뀐다.

	}

}
