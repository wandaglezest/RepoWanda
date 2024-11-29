package Apuntes.explicacionPOO;

import Apuntes.Alumno;

//alt + shift + r = refactor
//Control + 1 = crear variable

public class Prueba {
	public static void main(String[] args) {
		Alumno wanda = new Alumno();
		wanda.setNombre("Wanda");
		wanda.setApellido("González Estringana");
		wanda.setDni(4981454);

		Alumno marta = new Alumno("Marta", "Jiménez", 145405);

		System.out.println(wanda.getApellido());
		System.out.println(marta.getApellido());

	}
}
