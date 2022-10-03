
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		
		int sayi = topla(15,7);
		System.out.println(sayi);

	}
	
	public static void Add() {
		System.out.println("Eklendi.");
	}
	
	public static void Delete() {
		System.out.println("Silindi.");
	}
	
	public static void Update() {
		System.out.println("Güncellendi.");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
