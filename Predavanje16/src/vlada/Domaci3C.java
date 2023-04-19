package vlada;

import java.util.Scanner;

public class Domaci3C {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();
		
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente dvodimenzionalnog niza a");
		for (int i = 0; i<red; i++) {
			for (int j = 0; j<kolona; j++) {
				System.out.println("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica: ");
		for (int i = 0; i<red; i++) {
			for (int j = 0; j<kolona; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
			
		System.out.println("Elementi parnih indeksa kolona su: ");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				if((j+1)%2==0)
					System.out.print(a[i][j]+"  ");
			}
		}
		System.out.println();
		sc.close();
	}

}
