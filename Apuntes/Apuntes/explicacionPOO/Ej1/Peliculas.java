package Apuntes.explicacionPOO.Ej1;

public class Peliculas {

	private String nombrePel;
	private String generoPel;
	private int anioPel;
	private int duracionPel;

	public Peliculas(String nombre, String genero, int anio, int duracion) {
		this.nombrePel = nombre;
		this.generoPel = genero;
		this.anioPel = anio;
		this.duracionPel = duracion;
	}

	public String getNombrePel() {
		return nombrePel;
	}

	public void setNombrePel(String nombrePel) {
		this.nombrePel = nombrePel;
	}

	public String getGeneroPel() {
		return generoPel;
	}

	public void setGeneroPel(String generoPel) {
		this.generoPel = generoPel;
	}

	public int getAnioPel() {
		return anioPel;
	}

	public void setAnioPel(int anioPel) {
		this.anioPel = anioPel;
	}

	public int getDuracionPel() {
		return duracionPel;
	}

	public void setDuracionPel(int duracionPel) {
		this.duracionPel = duracionPel;
	}

}
