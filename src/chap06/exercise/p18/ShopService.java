package chap06.exercise.p18;

public class ShopService {

	private static ShopService shopservice;
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		if(shopservice == null) {
			shopservice = new ShopService();
		}
		return shopservice;
	}
}
