package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.topla(2, 3);
		System.out.println(toplam);
		
		int toplam2 = dortIslem.topla(2, 3, 4);
		System.out.println(toplam2);

	}

}
