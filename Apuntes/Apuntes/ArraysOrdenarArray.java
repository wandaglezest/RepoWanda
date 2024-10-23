package Apuntes;

import java.util.Arrays;
import java.util.Random;

public class ArraysOrdenarArray {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 números aleatorios. Ordena el array en orden ascendente y
		 * luego imprime el resultado. Puedes implementar tu propio algoritmo de
		 * ordenamiento (como burbuja o selección) o usar el método Arrays.sort().
		 */

		int[] arr = new int[10];
		Random azar = new Random();

		for (int i = 0; i < arr.length; i++) {

			arr[i] = azar.nextInt(100);
		}

		System.out.println("Array original:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("Array ordenado es:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
