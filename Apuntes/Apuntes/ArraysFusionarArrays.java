package Apuntes;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFusionarArrays {

	public static void main(String[] args) {
		/*
		 * Crea dos arrays de enteros y fusionarlos en un solo array. Imprime el nuevo
		 * array resultante. La longitud del nuevo array será la suma de las longitudes
		 * de los dos arrays originales.
		 */
		String[] arr1 = new String[3];
		String[] arr2 = new String[3];
		System.out.println("Escribe 3 palabras para el array 1");
		Scanner read = new Scanner(System.in);

		// Array 1
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = read.next();
		}
		System.out.println("Los elementos del array uno son:");
		for (String palabra : arr1) {
			System.out.print(palabra);
		}

		// Array 2
		System.out.print("\n");
		System.out.println("Escribe 3 palabras para el array 1");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = read.next();
		}

		System.out.println("Los elementos del array dos son:");
		for (String palabra : arr2) {
			System.out.print(palabra);
		}

		// Unir Arrays
		System.out.print("\n");
		String[] arrunidos = new String[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, arrunidos, 0, arr1.length);
		System.arraycopy(arr2, 0, arrunidos, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arrunidos));
	}

}
