package Apuntes.Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class IntercambiarClavesyValores {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que invierta las claves y los valores de un HashMap. Es
		 * decir, los valores se convertirán en claves y las claves se convertirán en
		 * valores.
		 */

		Scanner read = new Scanner(System.in);
		HashMap<String, String> jasmap = new HashMap<String, String>();

		while (true) {
			System.out.println("Escribe las claves primero. Pon 'fin' cuando hayas introducido todas.");
			String clave = read.nextLine();

			if (clave.equalsIgnoreCase("fin")) {
				break;
			}

			System.out.println("Introduce el valor para '" + clave + "': ");
			String valor = read.nextLine();
			read.nextLine(); // Limpiar el buffer del scanner después de leer un número

			// Añadir el par clave-valor al HashMap
			jasmap.put(clave, valor);

		}

		System.out.println(jasmap);
		read.close();

		HashMap<String, String> invertido = new HashMap<String, String>();

//		System.out.println("jasmap.keySet():" + jasmap.keySet());
//		System.out.println("jasmap.values()" + jasmap.values());
//		System.out.println("jasmap.entrySet()" + jasmap.entrySet());

		// Relacionamos que cada clave del hashmap es un elemento en el string clave
		for (String clave : jasmap.keySet()) {
			// Con .get obtenemos el valor asociado a cada clave del hashmap
			String valor = jasmap.get(clave);
			// ahora habiendo introducido cada dato en su elemento, los invertimos
			invertido.put(valor, clave);
		}
		System.out.println(invertido);

	}

}
