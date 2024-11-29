package Apuntes;

public class Alumno {
//{nombre apellido dni} crear getter y setter, llamada clase prueba
	private String nombre;
	private String apellido;
	private int dni;

	// Constructores. Inicializar objetos.

	// wanda
	public Alumno() {
	}

	// marta
	// nombreAlumno y demás vienen desde el main, mientras que nombre apellido y tal
	// vienen desde la clase alumno, aquí es donde indicamos que son iguales.
	public Alumno(String nombreAlumno, String apellidoAlumno, int dniAlumno) {
		this.nombre = nombreAlumno;
		this.apellido = apellidoAlumno;
		this.dni = dniAlumno;
	}

	// Getters y Setters. Introducir y obtener datos.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreAl) {
		this.nombre = nombreAl;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellidoAl) {
		this.apellido = apellidoAl;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dniAl) {
		this.dni = dniAl;
	}

}
