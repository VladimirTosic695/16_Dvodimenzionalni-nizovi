package vlada;

import java.util.Scanner;

public class Domaci4C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];
		
		System.out.println("Unesite elemente dvodimenzionalnog niza a");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Unesite elemente dvodimenzionalnog niza b");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("b[" + i + "," + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica(a): ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrica(b): ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<red; i++) {
			for(int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		
		System.out.println("Proizvod matrice a i b: ");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j < kolona; j++) {
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
