package Apuntes.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrecuenciaValores {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que cuente la frecuencia de cada palabra en un array de
		 * cadenas. Usa un HashMap donde la clave sea la palabra y el valor sea la
		 * cantidad de veces que aparece.
		 */

		ArrayList<String> arr = new ArrayList<String>();
		String b;
		System.out.println("Escribe las palabras de tu array. Escribe 'fin' para terminar.");
		Scanner read = new Scanner(System.in);

		while (true) {
			b = read.next();
			if (b.equalsIgnoreCase("fin")) {
				break;
			}
			arr.add(b);
		}
		System.out.println(arr);

		HashMap<String, Integer> frecuency = new HashMap<>();

		for (String palabra : arr) {
			frecuency.put(palabra, frecuency.getOrDefault(palabra, 0) + 1);
		}

		// Imprimir las frecuencias
		System.out.println("Frecuencia de palabras:");
		for (String palabra : frecuency.keySet()) {
			System.out.println(palabra + ": " + frecuency.get(palabra));
		}

		read.close();
	}
}