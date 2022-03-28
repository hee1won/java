package chap12.book.s120202Thread;

public class BeepPrintExample3 {
	public static void main(String[] args) {

		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("띵");
				thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}
