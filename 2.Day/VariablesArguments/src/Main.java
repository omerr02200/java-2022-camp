
public class Main {
	
	public static void main(String[] args) {
		int[] sayilar = {1, 2, 3, 4, 5, 6};
		int toplam = topla(sayilar);
		System.out.println(toplam);
	}
	
	public static int topla(int...is) {
		int toplam = 0;
		
		for (int i : is) {
			toplam += i;
		}
		
		return toplam;
	}
}
