package overriding;

public class Main {

	public static void main(String[] args) {
		// OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		// System.out.println(ogretmenKrediManager.hesapla(123));
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarımKrediManager(),
				new OgrenciKrediManager()};
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(123));
		}
	}

}
