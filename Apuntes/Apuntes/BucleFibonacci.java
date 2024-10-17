package Apuntes;

import java.util.Scanner;

public class BucleFibonacci {

	public static void main(String[] args) {
		// Crea un programa que genere y muestre los primeros N términos de la serie de
		// Fibonacci.

		Scanner read = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int numero = read.nextInt();
		read.close();

		int firstNumber = 0;
		int secondNumber = 1;

		// Verifica si el número es válido
		if (numero <= 0) {
			System.out.println("Por favor, ingrese un número entero positivo.");
		} else {
			System.out.print("Los primeros " + numero + " términos de la serie de Fibonacci son: ");

			// Genera la serie de Fibonacci
			for (int i = 0; i < numero; i++) {
				if (i == 0) {
					System.out.print(firstNumber + " ");
					continue;
				}
				if (i == 1) {
					System.out.print(secondNumber + " ");
					continue;
				}
				int fibonacci = firstNumber + secondNumber;
				System.out.print(fibonacci + " ");

				firstNumber = secondNumber;
				secondNumber = fibonacci;
			}
		}
	}
}