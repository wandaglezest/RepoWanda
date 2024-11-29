package Apuntes.explicacionPOO.Ej1;

public class Capitulos {
	private int numCap;
	private int duracionCap;

	public Capitulos(int numer, int duration) {
		numCap = numer;
		duracionCap = duration;
	}

	public int getNumCap() {
		return numCap;
	}

	public void setNumCap(int numCap) {
		this.numCap = numCap;
	}

	public int getDuracionCap() {
		return duracionCap;
	}

	public void setDuracionCap(int duracionCap) {
		this.duracionCap = duracionCap;
	}
}
