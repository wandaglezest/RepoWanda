package Apuntes.BuclesyOtros;

import java.util.Scanner;

public class SumadelosprimerosNnumeros {
	static public void main(String[] args) {

		/*
		 * Suma de los primeros N números Escribe un programa que solicite un número
		 * entero positivo N y calcule la suma de los primeros N números naturales (es
		 * decir, la suma de 1 hasta N).
		 */

		Scanner read = new Scanner(System.in);
		System.out.println("Dime un numero ");
		int n = read.nextInt();
		int a = 0;
		int serrieFibonacci = 0;
		System.out.print("La suma de los números ");
		for (a = 0; a <= n; a++) {
			System.out.print(a + ", ");

		}
		serrieFibonacci = (n * (n + 1)) / 2;

		System.out.print("es igual a: " + serrieFibonacci);

	}

}
