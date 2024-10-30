package Apuntes.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ArraysComprobarNumerosRepetidos {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 números enteros. Escribe un programa que imprima todos
		 * los números que están repetidos en el array. Pista: Puedes usar un segundo
		 * array o un conjunto (HashSet) para almacenar los números que ya has visto.
		 */

		Scanner read = new Scanner(System.in);
		HashSet<Integer> hset = new HashSet<>();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inserte número:");
			arr[i] = read.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			hset.add(arr[i]);
		}
		System.out.println(hset);
	}

}
