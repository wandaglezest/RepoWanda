package Apuntes.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysContarVocales {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		/*
		 * Crea un array de caracteres que contenga una cadena. Cuenta cuántasvocales
		 * hay en el array y muestra el resultado. Puedes usar un bucle for y un
		 * contador para contar las vocales.
		 */

		lista.add(read.nextLine());

		String vocales = "aeiouAEIOU";
		int contadorVocales = 0;

		// Iterar a través del array de palabras
		for (String palabra : lista) {
			// Iterar a través de cada carácter en la palabra
			for (char c : palabra.toCharArray()) {
				// Comprobar si el carácter es una vocal
				if (vocales.indexOf(c) != -1) {
					contadorVocales++;
				}
			}
		}

		System.out.println("El número de vocales en esta palabra es:" + contadorVocales);
	}

}
