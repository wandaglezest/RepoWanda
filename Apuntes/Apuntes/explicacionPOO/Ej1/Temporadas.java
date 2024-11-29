package Apuntes.explicacionPOO.Ej1;

public class Temporadas {

	private int numTemp;
	private int capitulosTemp;

	public Temporadas(int numero, int capitulos) {
		this.numTemp = numero;
		this.capitulosTemp = capitulos;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public int getCapitulosTemp() {
		return capitulosTemp;
	}

	public void setCapitulosTemp(int capitulosTemp) {
		this.capitulosTemp = capitulosTemp;
	}

}
