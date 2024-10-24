package Apuntes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCrearArrayList {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que: 1. Cree un ArrayList de enteros. 2. Permita al
		 * usuario ingresar 5 números enteros. 3. Los agregue al ArrayList. 4. Imprima
		 * el contenido del ArrayList después de haber ingresado los números.
		 */

		ArrayList<Integer> numeros = new ArrayList();
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int numero = read.nextInt();
			numeros.add(numero);
		}
		System.out.println("El ArrayList es: " + numeros);
		// Para que salga número a número
		System.out.println("Los números ingresados son:");
		for (Integer num : numeros) {
			System.out.println(num);
		}
		read.close();
	}

}
