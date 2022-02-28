package chap02.book02;

public class B11CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if ( (i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {	// 두 항중 하나라도 true면 true (if값 실행)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}

	}

}
