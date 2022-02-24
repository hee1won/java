package chap02.lecture;

public class C07TypeChar {

	public static void main(String[] args) {
		
		// 문자형 : char(2byte)
		char var1 = ' '; // 문자 하나를 넣을 수 있다 
		char var2 = '\\';
		char var3 = 'a';
		char var4 = '가';
		char var5 = '나';
		char var6 = '\uac00';
		System.out.println(var6);
		
		int var7 = var6;
		System.out.println(var7);
	}

}
