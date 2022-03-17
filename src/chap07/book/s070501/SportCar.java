package chap07.book.s070501;

public class SportCar extends Car{
		@Override
		
		public void speedUp() {speed += 10;}
		
		
		// final을 선언해서 오버라이딩을 할 수 없음 
//		public void stop() {
//			System.out.println("스포츠카를 멈춤");
//			speed = 0;
//	}

}
