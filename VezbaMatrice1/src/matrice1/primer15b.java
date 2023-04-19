package matrice1;

import java.util.Scanner;

public class primer15b {

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
		
		double s = 0;
		int brojac = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (a[i][j] > 0) {
					s+=a[i][j];
					brojac++;
				}
			}
		}
		System.out.println("Srednja vrednost parnih elemenata je "+s/brojac);
		sc.close();
	}

}
