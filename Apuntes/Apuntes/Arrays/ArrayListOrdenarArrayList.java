package Apuntes.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOrdenarArrayList {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que: 1. Cree un ArrayList de enteros y permita al usuario
		 * agregar números hasta que ingrese un número negativo (el número negativo no
		 * debe agregarse a la lista). 2. Ordene el ArrayList en orden ascendente. 3.
		 * Imprima el ArrayList ordenado.
		 */
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println(
				"Introduzca los números que desea añadir a la lista.Con un número negativo se parará de introducir números.");
		while (true) {
			int arraylista = read.nextInt();
			if (arraylista >= 0) {
				numeros.add(arraylista);

			} else if (arraylista <= 0) {
				break;
			}
		}
		Collections.sort(numeros);
		System.out.println("El array ordenado de manera ascendente: " + numeros);
		read.close();

	}

}
