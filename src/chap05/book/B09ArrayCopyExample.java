package chap05.book;

public class B09ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 첫번째 : 원본, 두번째 : 원본의 시작 위치, 세번째 : 복사본, 네번째 : 복사본 시작 위치, 다섯번째 : 길이
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]+",");
		}

	}

}
