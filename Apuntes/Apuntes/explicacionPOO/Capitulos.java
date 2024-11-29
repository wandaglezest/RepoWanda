package Apuntes.explicacionPOO;

public class Capitulos {
	private int numCap;
	private int duracionCap;

	public Capitulos(int numer, int duration) {
		this.numCap = numer;
		this.duracionCap = duration;
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
