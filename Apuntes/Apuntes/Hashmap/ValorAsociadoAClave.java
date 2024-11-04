package Apuntes.Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ValorAsociadoAClave {

	public static void main(String[] args) {
		/*
		 * Crea un HashMap que contenga los nombres de estudiantes como claves y sus
		 * calificaciones como valores. Luego, escribe un método que te permita buscar
		 * la calificación de un estudiante dado su nombre.
		 */
		try {
			HashMap<String, Integer> nombres = new HashMap<>();
			nombres.put("Ana", 4);
			nombres.put("Luis", 6);
			nombres.put("Bea", 7);
			nombres.put("Carlos", 3);
			Scanner read = new Scanner(System.in);
			System.out.println("Introduce el alumno del que quieras saber la nota:");
			String nombreBuscado = read.nextLine();
			read.close();
			Integer calificacion = nombres.get(nombreBuscado);
			if (calificacion == null) {
				throw new NullPointerException("El alumno no se encuentra en el registro.");
			}

			System.out.println("La calificación de " + nombreBuscado + " es: " + calificacion);

		} catch (NullPointerException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		}

	}

}
