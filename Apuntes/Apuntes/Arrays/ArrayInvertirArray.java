package Apuntes.Arrays;

import java.util.Scanner;

public class ArrayInvertirArray {

	public static void main(String[] args) {
		/*
		 * Objetivo: Crea un array de 5 números y crea otro array que contenga los
		 * mismos números pero en orden inverso. Imprime el nuevo array. Pista: Puedes
		 * usar un bucle para recorrer el array original desde el final hasta el
		 * principio.
		 */
		int[] arry = new int[5];
		int[] arryinverso = new int[arry.length];
		int j = arry.length - 1;

		Scanner read = new Scanner(System.in);

		for (int i = 0; i < arry.length; i++) {
			System.out.println("Escribe un número:");
			arry[i] = read.nextInt();

		}

		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + ",");

		}

		for (int i = 0; i < arryinverso.length; i++) {
			arryinverso[i] = arry[j];
			j--;

		}

		System.out.print("A la inversa es: ");

		for (int i = 0; i < arryinverso.length; i++) {
			System.out.print(arryinverso[i] + ",");

		}
	}
}
