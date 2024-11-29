package Apuntes.explicacionPOO.Ej2;

public class Cancion {
	private String nombre;
	private String grupo;
	private int anio;

	public Cancion(String nombreCancion, String grupoCancion, int anioCancion) {
		this.nombre = nombreCancion;
		this.grupo = grupoCancion;
		this.anio = anioCancion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
