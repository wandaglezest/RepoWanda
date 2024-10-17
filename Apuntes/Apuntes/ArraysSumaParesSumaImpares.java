package Apuntes;

import java.util.Scanner;

public class ArraysSumaParesSumaImpares {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que solicite al usuario 10 números y luego calcule la
		 * suma de los números pares y la suma de los números impares por separado.
		 */

		Scanner read = new Scanner(System.in);

		System.out.println("Escribe 10 números.");

		int[] arr = new int[10];
		int sumaPares = 0;
		int sumaImpares = 0;
		int i = 0;

		for (i = 0; i < arr.length; i++) {
			System.out.println("Número " + (i + 1) + ":");
			arr[i] = read.nextInt();

			if (arr[i] % 2 == 0) {
				sumaPares += arr[i]; // Sumar a la suma de pares
			} else {
				sumaImpares += arr[i]; // Sumar a la suma de impares
			}
		}
		System.out.println("La suma de los números pares es: " + sumaPares);
		System.out.println("La suma de los números impares es: " + sumaImpares);
		read.close();
	}

}
