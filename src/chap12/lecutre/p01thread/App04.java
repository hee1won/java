package chap12.lecutre.p01thread;

public class App04 {
	public static void main(String[] args) {
		// sleep : 현재 쓰레드 실행을 milliseconds 만큼 멈춤 
		
		System.out.println(" 쓰레드 실행 중 .... ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" 쓰레드 실행 계속 ...");
	}

}
