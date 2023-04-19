package matrice1;

import java.util.Scanner;

public class primer15d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();

		double a[][] = new double[red][kolona];

		System.out.println("Unesite elemente matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + "," + j + "] =");
				a[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < red; i++) {
			double s = 0,srednja = 0; 
			int brojac = 0;
			for (int j = 0; j < kolona; j++) {
				if(a[j][i] % 2 == 0) {
					s+= a[j][i];
					brojac++; 
					}
					srednja = s / brojac;
			}
			System.out.println("Srednja vrednost parnih brojeva za "+brojac+". kolonu je "+srednja);
		}
		sc.close();
	}

}
