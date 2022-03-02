package chap04.exercise;

public class Exercise03 {

	public static void main(String[] args) {
		
		// for문을 이용해서 1부터 100까지의 정수중에 3의 배수의 총합을 구하는 코드 
		
		int a = 0;
		
		for(int i = 3; i <= 100; i += 3 ) {
			a += i;
		}
		
		System.out.println("3의 배수의 합:"+a);
	}

}
