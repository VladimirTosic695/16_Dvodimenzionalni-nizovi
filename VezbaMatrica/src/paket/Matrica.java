package paket;

public class Matrica {
	
	private double m [][];
	
	Matrica(int vrs, int kol){
		m = new double [vrs][kol];
	}
	
	public double getVrsta() {
		return m.length;
	}
	
	public double getKolona() {
		return m[0].length;
	}
	
	public Matrica postavi(int v, int k, double vr) {
		 m [v][k] = vr;
		 return this;
	}
	
	public double dohvati(int v, int k) {
		return m[v][k];
	}
	
	public String toString() {
		String s = "";
		for(int v = 0; v < m.length; v++) {
			for(int k = 0; k < m[0].length; k++) {
				System.out.print(m[v][k] + " ");
						s = s + "";
			}
			System.out.println();
		}
		return s;
	}

}
