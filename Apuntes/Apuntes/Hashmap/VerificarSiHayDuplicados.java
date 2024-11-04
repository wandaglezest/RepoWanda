package Apuntes.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VerificarSiHayDuplicados {
	/*
	 * Escribe un programa que reciba una lista de números y determine si hay algún
	 * número que se repita. Usa un HashMap para almacenar los números y su
	 * frecuencia de aparición.
	 */

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		System.out.println("Escribe número para tu array. Escribe 'fin' para terminar.");
		Scanner read = new Scanner(System.in);

		while (true) {
			String b = read.next();
			if (b.equalsIgnoreCase("fin")) {
				break;
			}
			arr.add(b);
		}
		System.out.println(arr);

		HashMap<String, Integer> frecuency = new HashMap<>();
		// Cuantas veces se repite cada número:
		for (String palabra : arr) {
			frecuency.put(palabra, frecuency.getOrDefault(palabra, 0) + 1);
		}

		// Vemos si hay duplicados
		boolean duplicados = false;
		for (String count : frecuency.keySet()) {
			if (frecuency.get(count) > 1) {
				duplicados = true;
				System.out.println("El número " + count + " se repite.");

			}
		}
		if (!duplicados) {
			System.out.println("No hay números que se repiten");

		}

		read.close();

	}
}
