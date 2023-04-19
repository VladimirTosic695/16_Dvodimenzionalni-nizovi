package matrice1;

import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova");
		int red =sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();
		
		int a[][] = new int[red][kolona];
		
		int s =0;
		
		System.out.println("Unesite elemente matrice");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica a:");
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<red; i++) {
			for(int j = 0; j<kolona; j++) {
				s += a[i][j];
			}
		}
		
		System.out.println("Suma svih elemenata matrice je "+s);
		sc.close();
	}

}
