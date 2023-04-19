package vlada;

import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Broj redova: ");
		int red = sc.nextInt();
		
		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz [][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				System.out.print("a ["+i+","+j+"] = ");
				niz [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Parni elementi matrice su: ");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				if(niz[i][j]%2==0)
				System.out.println(niz[i][j]+" ");
			}
		}
		sc.close();
	}

}
