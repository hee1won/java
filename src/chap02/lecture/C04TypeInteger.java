package chap02.lecture;

public class C04TypeInteger {

	public static void main(String[] args) {
		
		double v1 = 3.14;
//		int v2 = 3.14; // x
		
		// 데이터 타입(자료형)
		// 기본타입(primitive) 8개
		
		// 정수
		// byte, short, int, long
		
		// 실수
		// float, double
		
		// 논리
		// boodlean
		
		// 문자(정수)
		// char
		
		// 참조형 (reference type) 위 8개 빼고 다
		// 챕터5에서 설명
		
		/////////////////////////////////////
		
		// 정수 (byte(1byte), short(2byte), int(4byte), long(8byte))
		
		// int
		int var1 = 30;
		int var2 = Integer.MAX_VALUE;
		System.out.println(var2); // int 최대값
		int var4 = Integer.MIN_VALUE;
		System.out.println(var4); // int 최소값
		
		int var3 = 2147483647; // 최대값 
		int var5 = -2147483648; // 최소값
		
		
		// short
		System.out.println(Short.MAX_VALUE); // short 최대값 
		System.out.println(Short.MIN_VALUE); // short 최소값
		
		short var6 = 32767;  // 최대값 
		short var7 = -32768; // 최소값 
		
		
		// byte
		System.out.println(Byte.MAX_VALUE); // byte 최대값
		System.out.println(Byte.MIN_VALUE); // byte 최소값 
		
		byte var8 = 127; // 최대값
		byte var9 = -128; // 최소
		
		System.out.println(var8); // 127
		byte var10 = (byte) (var8+1);
		System.out.println(var10); // -128
		
		System.out.println(var3 + 1); // overflow(최대값 보다 큰 경우)
		
		long var11 = 923874927;
		System.out.println(Long.MAX_VALUE); // long 최대값 
		System.out.println(Long.MIN_VALUE); // long 최소값 
		long var12 = 9223372036854775807L; // 최대값
		long var13 = -9223372036854775808L; // 최소값 
		
		System.out.println(2147483647);
		System.out.println(2147483648L); // int보다 범위가 큰 literal은 끝에 l(L)을 붙힌다.
		
		
		// 큰 정수 사용시 _ 조합 가능 
		int var14 = 12_3872_1234;
		int var15 = 2_138_573_234;
	}

}
