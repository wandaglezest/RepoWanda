package Apuntes;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere un número aleatorio entre 1 y 100. Luego, el
		 * usuario debe intentar adivinar el número. El programa debe decir si el número
		 * introducido es mayor, menor o igual al número aleatorio, y çrepetirse hasta
		 * que el usuario adivine correctamente.
		 */

		int numaleatorio = (int) (Math.random() * 100) + 1;

		System.out.println(numaleatorio);
		int numerodado;
		System.out.println("Adivina un número.");
		do {

			Scanner read = new Scanner(System.in);
			numerodado = read.nextInt();

			if (numerodado < numaleatorio) {
				System.out.println("Mayor.");
			} else {
				if (numerodado > numaleatorio) {
					System.out.println("Menor.");
				}
			}

		} while (numerodado != numaleatorio);
		System.out.println("¡ES CORRECTO!");

	}
}
