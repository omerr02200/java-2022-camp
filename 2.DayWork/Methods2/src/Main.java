
public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = centTake();
		System.out.println(newMessage);
		int number = topla(5,7);
		System.out.println(number);

	}
	
	public static void add() {
		System.out.println("Eklendi");
	}
	
	public static void delete() {
		System.out.println("Silindi");
	}
	
	public static void update() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int number1, int number2) {
		return number1 + number2;
	}
	
	public static String centTake() {
		return "Ankara";
	}

}
