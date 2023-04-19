package matrice1;

import java.util.Scanner;

public class primer1b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();
		
		int a [] [] = new int [red+1][kolona+1];
		
		System.out.println("Unesite elemente matrice");
		for(int i = 1; i<=red; i++) {
			for(int j = 1; j<=kolona; j++) {
				System.out.println("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica: ");
		for(int i = 1; i<=red; i++) {
			for(int j = 1; j<=kolona; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Elementi prvog reda su: ");
		for(int i = 1; i<=red; i++) {
			for(int j = 1; j<=kolona; j++) {
				if(i == 1) {
					System.out.print(a[i][j]+"  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
