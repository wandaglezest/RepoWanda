package Apuntes.explicacionPOO;

public class Series {

	private String nombreSer;
	private String generoSer;
	private int temporadasSer;

	public Series(String nombre, String genero, int temporadas) {
		this.nombreSer = nombre;
		this.generoSer = genero;
		this.temporadasSer = temporadas;
	}

	public String getNombreSer() {
		return nombreSer;
	}

	public void setNombreSer(String nombreSer) {
		this.nombreSer = nombreSer;
	}

	public String getGeneroSer() {
		return generoSer;
	}

	public void setGeneroSer(String generoSer) {
		this.generoSer = generoSer;
	}

	public int getTemporadasSer() {
		return temporadasSer;
	}

	public void setTemporadasSer(int temporadasSer) {
		this.temporadasSer = temporadasSer;
	}

}
