package paket;

public class Main {

	public static void main(String[] args) {
		
		Matrica m1 = new Matrica(3, 3);
		
		System.out.println(m1.getKolona());
		System.out.println(m1.getVrsta());
		System.out.println(m1.postavi(2, 2, 15));
		System.out.println(m1.dohvati(2, 2));
		System.out.println(m1.toString());

	}

}
