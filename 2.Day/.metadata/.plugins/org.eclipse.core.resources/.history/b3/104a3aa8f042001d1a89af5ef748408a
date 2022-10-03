public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int number = 3;

		Boolean isHas = findNumber(numbers, number);
		mesaj(isHas, number);
	}

	public static boolean findNumber(int[] numbers, int number) {
		Boolean isHas = false;

		for (int x : numbers) {
			if (x == number) {
				isHas = true;
				break;
			}
		}
		return isHas;
	}

	public static void mesaj(Boolean isHas, int number) {
		if (isHas) {
			System.out.println("Sayı mevcuttur: " + number);
		} else
			System.out.println("Sayı mevcut değildir: " + number);
	}
}
