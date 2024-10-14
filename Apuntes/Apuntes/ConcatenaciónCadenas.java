package Apuntes;

import java.util.Scanner;

public class ConcatenaciónCadenas {
	public static void main(String[] args) {
		/*
		 * Declara tres variables: nombre, apellido, y edad. Combínalas en una cadena
		 * que forme una oración como
		 * "Mi nombre es [nombre] [apellido] y tengo [edad] años" y muéstrala en la
		 * consola.
		 */
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		String nombre = leer.next();
		System.out.println("Dime tu Apellido");
		String apellido = leer.next();
		System.out.println("Dime tu edad");
		String edad = leer.next();

		String result = "Mi nombre es " + nombre.concat(apellido) + " y tengo " + edad + " años.";

		System.out.println(result);
	}

}
