package matrice1;

import java.util.Scanner;

public class primer1c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();
		
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				System.out.println("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica: ");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Elementi druge kolone su: ");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				if(j == 1)
					System.out.println(a[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
