package vlada;

import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int red, kolona;

		System.out.println("Unesite broj redova");
		red = sc.nextInt();

		System.out.println("Unesite broj kolona");
		kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}

		int najmanjiElement = 1000;
		System.out.println("Elementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + "  ");
				if(a[i][j]<najmanjiElement)
					najmanjiElement = a[i][j];
			}
		}
		System.out.println();
		System.out.println("Najmanji element niza je " + najmanjiElement);
		sc.close();
	}

}
