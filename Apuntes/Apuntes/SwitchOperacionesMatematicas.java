package Apuntes;

import java.util.Scanner;

public class SwitchOperacionesMatematicas {
	static Scanner leer = new Scanner(System.in);
	static int num1 = 0, num2 = 0;

	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre un menú con las siguientes opciones: 1. Sumar
		 * dos números 2. Restar dos números 3. Multiplicar dos números 4. Dividir dos
		 * números 5. Salir El usuario debe poder elegir una opción y realizar la
		 * operación correspondiente. Si selecciona la opción 5, el programa debe
		 * terminar.
		 */

		System.out.println(
				"Elige 1 para sumar, elige 2 para restar, elige 3 para multiplicar, elige 4 para dividir y elige 5 para salir.");
		Scanner leer = new Scanner(System.in);
		int opcion = leer.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Dame dos números para sumar:");
			pideNumeros();
			System.out.print("La suma de los números " + num1 + " y " + num2 + " es:  " + (num1 + num2) + ".");

			break;
		case 2:
			System.out.println("Dame dos números para restar:");
			pideNumeros();
			System.out.print("La resta de los números " + num1 + " y " + num2 + " es:  " + (num1 - num2) + ".");
			break;
		case 3:
			System.out.println("Dame dos números para multiplicar:");
			pideNumeros();
			System.out
					.print("La multiplicación de los números " + num1 + " y " + num2 + " es:  " + (num1 * num2) + ".");
			break;
		case 4:
			System.out.println("Dame dos números para dividir:");
			pideNumeros();
			System.out.print("La división de los números " + num1 + " y " + num2 + " es:  " + (num1 / num2) + ".");
			break;
		case 5:
			System.out.println("El programa se cerró.");
			break;
		default:
			System.out.println("Número no reconocido");
			break;
		}
	}

	// Método para recoger variables por consola
	public static void pideNumeros() {
		System.out.println("Introduce número 1:");
		num1 = Integer.parseInt(leer.nextLine());

		System.out.println("Introduce número 2:");
		num2 = Integer.parseInt(leer.nextLine());

		// Mostrar un salto de línea en Java
		System.out.println("\n");
	}
}
