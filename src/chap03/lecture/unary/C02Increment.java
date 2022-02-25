package chap03.lecture.unary;

public class C02Increment {

	public static void main(String[] args) {
		
		// 증감연산자 
		// 증가 increment ++
		// 감소 decrement --
		
		int i = 7;
		i++;	// i = i + 1
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i--;	// i = i - 1
		System.out.println(i);
		i--;
		System.out.println(i);
		
		// 증감연산자 위치 : 피연산자 앞/뒤
		++i; // i = i + 1
		System.out.println(i);	// 8
		
		--i;
		System.out.println(i);	// 7
		
		System.out.println(i++); // 7	피연산자가 앞에 있으면 후에 증가시킨다.
		System.out.println(i);	 // 8
		
		System.out.println(i--);	// 8	피연산자가 앞에 있으면 후에 감소시킨다. 
		System.out.println(i);		// 7
		
		System.out.println(++i);	// 8
		System.out.println(i);		// 8
		
		System.out.println(--i);	// 7
		System.out.println(i);		// 7
		
		
		int j = i++;
		int k = ++i;
		
		System.out.println(j);
		System.out.println(k);
		
		int l = i;
		i++;
		
		i++;
		int m = i;
		System.out.println(i);
		
	}

}
