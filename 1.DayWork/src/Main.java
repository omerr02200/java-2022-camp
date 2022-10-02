public class Main {

	public static void main(String[] args) {

		// Hello world 
		System.out.println("Hello Java");
		System.out.println("Merhaba Java");

		// Variables 
		int ogrenciSayisi = 10; String mesaj = "Öğrenci Sayısı: ";

		System.out.println(mesaj + ogrenciSayisi);

		// if 
		int sayi = 19;
		if (sayi < 24) {
		System.out.println("Sayı 20'den küçüktür.");
		}
		else if(sayi==20){
			System.out.println("Sayı 20'ye eşittir.");
			}
		else{
			System.out.println("Sayı 20'den büyüktür.");
			}

	// reCap Demo1 
		int sayi1 = 20; 
		int sayi2 = 25; 
		int sayi3 = 2; 
		int enBuyuk = sayi1;

	if(sayi1<sayi2){
		enBuyuk = sayi2;
		}
	if(sayi1<sayi3){
		enBuyuk = sayi3;
		}

	System.out.println("En büyük sayı:"+enBuyuk);

	// Switch 
	char grade = 'B';

	switch(grade){ 
		  case 'A': 
			  System.out.println("Mükemmel : Geçtiniz");
			  break;
		  case 'B': 
		  case 'C': 
			  System.out.println("Çok güzel : Geçtiniz"); 
			  break; 
			  case 'D': 
			  System.out.println("İyi : Geçtiniz"); 
			  break; 
			  case 'E':
			  System.out.println("Fena Değil : Geçtiniz"); 
		      break; 
		  case 'F':
		     System.out.println("Maalesef : Kaldınız"); 
		     break; 
		  default:
			  System.out.println("Geçersiz not girdiniz");
		  }

	// For 
	for (int i = 1; i < 10; i += 2) {
		System.out.println(i);
		}
	System.out.println("For döngüsü bitti.");

	// While 
	int i = 2; 
	while (i < 10) {
		System.out.println(i); i += 2;
		}

	System.out.println("While döngüsü bitti.");

	// Do-While 
	int j = 100; 
	do {
		System.out.println(j); j += 2;
		} 
	while (j < 10);
	System.out.println("Do-While döngüsü bitti.");

	// Arrays 
	String[] ogrenciler = new String[3];

	ogrenciler[0]="Engin";ogrenciler[1]="Derin";ogrenciler[2]="Salih";

	for(int k = 0;k<ogrenciler.length;k++){
		System.out.println(ogrenciler[k]);
		}

	System.out.println("------------------------");

	for(String ogrenci:ogrenciler){
		System.out.println(ogrenci);
		}

	// ReCap Demo2 
	double[] myList = { 1.2, 6.7, 4.3, 5.6 }; 
	double total = 0;
	double max = myList[0];for(
	double number:myList){
		if (max < number) {
			max = number;
		}
		total += number;
		System.out.println(number);
	}
	System.out.println("Toplam = "+total);
	System.out.println("En büyük ="+max);

	// Multi Dimensional Array Demo 
	String[][] sehirler = new String[3][3];

	sehirler[0][0]="İstanbul";
	sehirler[0][1]="Bursa";
	sehirler[0][2]="Bilecik";
	sehirler[1][0]="Ankara";
	sehirler[1][1]="Konya";
	sehirler[1][2]="Kayseri";
	sehirler[2][0]="Diyarbakır";
	sehirler[2][1]="Gaziantep";
	sehirler[2][2]="Şanlıurfa";

	for(int x = 0;x<=2;x++){
		System.out.println("------------------------");
		for (int y = 0; y <= 2; y++) {
			System.out.println(sehirler[x][y]);
		}
	}

	// Strings
	String messaj = "Bugün hava çok güzel.";
	System.out.println(messaj);

	System.out.println("Eleman sayısı: "+messaj.length());
	System.out.println("5. eleman : "+messaj.charAt(4));
	System.out.println(messaj.concat(" Yaşasın"));
	System.out.println(messaj.startsWith("b"));
	System.out.println(messaj.endsWith("."));
	char[] karakterler = new char[5];
	messaj.getChars(0,5,karakterler,0);
	System.out.println(karakterler);
	System.out.println(messaj.indexOf("av"));
	System.out.println(messaj.lastIndexOf('a'));

	String yeniMesaj = messaj.replace(' ', '-');
	System.out.println(yeniMesaj);
	System.out.println(messaj.substring(2)); // gün hava çok güzel.
	System.out.println(messaj.substring(2,4)); // gü

	for(String kelime:messaj.split(" ")){
		System.out.println(kelime);
	}

	System.out.println(messaj.toLowerCase());
	System.out.println(messaj.toUpperCase());

	System.out.println(messaj.trim());

	// Sayı asal mı? 
	int number = -1; int remainder = number % 2;
	System.out.println(remainder);

	Boolean isPrime = true;

	if(number==1){
		System.out.println("Sayı asal değildir.");
		return;
	}
	if(number<2){
		System.out.println("Geçersiz sayı.");
		return;
	}

	for(int x = 2;x<number;x++){
		if (number % x == 0) {
			isPrime = false;
		}
	}

	if(isPrime){
		System.out.println("Sayı asaldır");
	}
	else{
		System.out.println("Sayı asal değildir");
	}

	// Kalın sesli harf, İnce sesli harf 
	char harf = 'A';

	switch(harf){
	case 'A': 
    case 'I': 
	case 'U': 
	case 'O':
		System.out.println("Kalın sesli harf");
		break;
	default:
		System.out.println("İnce sesli harf"); }

	// Mükemmel sayı
	// 6-->1, 2, 3
	// 28-->1, 2, 4, 7, 14

	int numberr = 27;
	int totall = 0;

	for(int z = 1;z<numberr;z++){
		if (numberr % z == 0) {
			totall += z;
		}
	}

	if(totall==numberr){
		System.out.println("Sayı mükemmeldir");
	}
	else 
		System.out.println("Sayı mükemmel değildir");
	
	//Arkadaş Sayılar 220-284
	int numb1 = 220;
	int numb2 = 284;
	int toplam1 = 0;
	int toplam2 = 0;
	
	for(int t=1; t<numb1; t++) {
		if(numb1 % t == 0) {
			toplam1 += t;
		}
	}
		
	for(int w=1; w<numb2; w++) {
		if(numb2 % w == 0) {
			toplam2 += w;
		}
	}
	
	if(numb1 == toplam2 && numb2 == toplam1) {
		System.out.println("Bu iki sayı arkadaştır");
	}else {
		System.out.println("Bu iki sayı arkadaş değildir");
	}
	
	}
}
