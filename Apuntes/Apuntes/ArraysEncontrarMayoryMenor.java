package Apuntes;

import java.util.Scanner;

public class ArraysEncontrarMayoryMenor {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 números enteros y determina el mayor y el menor número en
		 * el array. Imprime ambos valores. Pista: Inicializa dos variables para guardar
		 * el mayor y el menor, y actualízalas mientras recorres el array.
		 */

		Scanner read = new Scanner(System.in);

		// Crear un array de 5 números enteros
		int[] cinco = new int[5];

		// Crear un objeto Scanner para recoger la entrada
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese 5 números
		System.out.println("Por favor, ingrese 5 números enteros:");

		for (int i = 0; i < cinco.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			cinco[i] = scanner.nextInt(); // Leer el número y almacenarlo en el array
		}

		// Inicializar las variables para el mayor y el menor
		int mayor = cinco[0];
		int menor = cinco[0];

		// Recorrer el array para encontrar el mayor y el menor
		for (int i = 1; i < cinco.length; i++) {
			if (cinco[i] > mayor) {
				mayor = cinco[i]; // Actualizar el mayor
			}
			if (cinco[i] < menor) {
				menor = cinco[i]; // Actualizar el menor
			}
		}

		System.out.println("El mayor es: " + mayor + ", y el menor es: " + menor + ".");
	}
}
