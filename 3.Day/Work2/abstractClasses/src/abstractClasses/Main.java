package abstractClasses;

public class Main {

	public static void main(String[] args) {
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		
		GameCalculator womanGameCalculator = new WomanGameCalculator();
		GameCalculator kidsGameCalculator = new KidsGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
	}

}
