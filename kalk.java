import java.util.Scanner;

public class kalk {
	public static void main( String [] args ) {
	
	Scanner kalkulator = new Scanner(System.in);
	
	System.out.println( "hello  selamat datang di percobaan kalkulator milik parsha pratama johari, masukkan nama anda terlebih dahulu");
	String nama = kalkulator.nextLine();
		if ( nama.isEmpty() )  {
			System.out.println( "masukkan dulu nama anda agar saya bisa kenal " );
			String kule = kalkulator.nextLine();
			
			if (kule.isEmpty()) {
				System.out.println( "masukkan dulu nama anda agar saya bisa kenal ");
			}
			else {
				System.out.println("terimakasih telah memberitahu nama anda, salam kenal "+ kule );
			}
		}
		else {
			System.out.println("terimakasih telah memberitahu nama anda, salam kenal "+ nama );
		}
		
		System.out.println("------------------");
		System.out.println("------------------");
	
	System.out.println ( "apakah anda ingin menggunakan kalkulator kami ? (Y/N) " );
	String uw = kalkulator.nextLine();
	while ( uw.equalsIgnoreCase("N")){
	if ( uw.equalsIgnoreCase("Y")){
		System.out.println("baiklah, selamat mencoba");
	}
	else {
		System.out.println("apakah anda yakin tidak ingin menggunakan kalkulator parsha?(Y/N)");
		String ey = kalkulator.nextLine();
		
		if ( ey.equalsIgnoreCase ("Y")) {
			System.out.println( "baiklah terimakasih atas kunjungan anda ");
			System.exit(0);
		}
	}
	}
	
	
	System.out.println("------------------");
	System.out.println("------------------");
	
	System.out.println( "masukkan angka pertama anda!");
	double angka = kalkulator.nextDouble();
	
		System.out.println("------------------");
		System.out.println("------------------");
	
	System.out.println( "operasi mana yang ingin anda gunakan? * atau / atau - atau +");
	String yy = kalkulator.next();
	
	System.out.println("------------------");
	System.out.println("------------------");
	
	System.out.println( "masukkan angka yang ingin anda operasikan!");
	double kali = kalkulator.nextDouble();
	
	System.out.println("------------------");
	System.out.println("------------------");
	
	
	
	if ( yy.equals("*")){
			double hasil = (double) angka * kali;
			System.out.println( "jawaban mu adalah "+ (float) hasil);
		}
		else if ( yy.equals("/")){
			double hasil = (double) angka / kali;
			System.out.println( "jawaban mu adalah "+ (float) hasil);
		}
		else if ( yy.equals("+")){
			double hasil = (double) angka + kali;
			System.out.println( "jawaban mu adalah "+ (float) hasil);
		}
		else if ( yy.equals("-")){
			double hasil = (double) angka - kali;
			System.out.println( "jawaban mu adalah "+ hasil);
		}
		else { 
			System.out.println("jawaban kamu error");
		}
		
		System.out.println ( "apakah anda ingin mengakhiri kalkulator ini ? (Y/N) " );
		String tt = kalkulator.next();
		System.out.println("");
	
	if ( tt.equalsIgnoreCase("Y")){
		System.out.println("baiklah, sampai jumpa  lagi");
		System.exit(0);
	}
	else {
		System.out.println("oke silahkan mencoa lagi");
		return;
	}
	}
}
