package Apuntes.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBuscarenunArray {

	public static void main(String[] args) {
		/*
		 * 1. Cree un ArrayList de enteros y permita al usuario agregar 10 números. 2.
		 * Le pida al usuario un número a buscar en el ArrayList. 3. Si el número
		 * existe, imprima el índice en el que se encuentra. Si no, muestra un mensaje
		 * indicando que no está presente.
		 */
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		System.out.println("Indica 10 números:");
		for (int i = 0; i < 10; i++) {
			int rellenar = read.nextInt();
			num.add(rellenar);
		}
		System.out.println("El arraylist es: " + num);

		encontrarPosicion(num, read);
		read.close();
	}

	private static void encontrarPosicion(ArrayList<Integer> num, Scanner read) {
		while (true) {
			System.out.println("Selecciona el número que quieres encontrar.");
			int numbuscar = read.nextInt();
			if (num.contains(numbuscar)) {
				int posicionnumero = num.indexOf(numbuscar);
				System.out.println("El número se encuentra en la posición: " + (posicionnumero + 1));
				break;
			} else {
				System.out.println("Este número no se encuentra en el array.");
			}
		}
	}

}
