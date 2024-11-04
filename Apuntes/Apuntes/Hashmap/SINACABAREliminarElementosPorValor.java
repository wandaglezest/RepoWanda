package Apuntes.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SINACABAREliminarElementosPorValor {
	// Escribe un programa que elimine todos los elementos de un HashMap donde el
	// valor sea menor a un número dado.
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
		for (String contar : frecuency.keySet()) {
			if (frecuency.get(contar) > 1) {
				System.out.println("El número " + contar + " se repite " + frecuency.get(contar) + " veces.");
			}
		}

		System.out.println("Elije la frecuencia de los números a eliminar");
		int elimfrecu = read.nextInt();

		for (String contar : frecuency.keySet()) {
			if (frecuency.get(contar) > elimfrecu) {
				System.out.println("El número " + contar + " que se repite " + frecuency.get(contar)
						+ " veces, ha sido eliminado");
				frecuency.remove(contar);
			}
		}
		System.out.println(arr);

	}
}
