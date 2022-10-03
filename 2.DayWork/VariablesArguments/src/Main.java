
public class Main {

	public static void main(String[] args) {
		int result = topla(5, 7, 11, 85);
		System.out.println(result);

	}
	
	public static int topla(int...is) {
		int result = 0;
		for (int number : is) {
			result += number;
		}
		return result;
	}

}
