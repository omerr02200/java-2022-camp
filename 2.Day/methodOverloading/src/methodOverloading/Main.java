package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.topla(3, 4);
		System.out.println(toplam);
		
		int toplam2 = dortIslem.topla(3, 4, 5);
		System.out.println(toplam2);
	}

}
