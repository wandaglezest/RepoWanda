package Apuntes.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EliminarElementosPorValor {

	public static void main(String[] args) {
		// Escribe un programa que elimine todos los elementos de un HashMap donde el
		// valor sea menor a un número dado.
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

		System.out.println("Frecuencia de las palabras: " + frecuency);

		System.out.println("Elige el mínimo número de veces repetido que quieres que se elimine ");
		int minimoveces = read.nextInt();

		// creamos una lista de eliminaciones
		ArrayList<String> eliminar = new ArrayList<>();

		/*
		 * Recorremos el hashmap para comprobar que números se repiten igual o menos
		 * veces y los añade a la lista eliminar
		 */
		for (String contador : frecuency.keySet()) {
			if (frecuency.get(contador) <= minimoveces) {
				eliminar.add(contador);
			}

		}

		// Eliminar las claves en la lista de eliminaciones
		for (String key : eliminar) {
			frecuency.remove(key);
		}
		// Mostrar el HashMap después de la eliminación
		System.out.println("El Hashmap queda así: " + frecuency);

		read.close(); // Cerrar el scanner al finalizar
	}

}
