package Apuntes.Arrays;

import java.util.Scanner;

public class ArraysPromedioElementos {

	public static void main(String[] args) {
		/*
		 * Crea un array de 6 números flotantes. Calcula el promedio de los números y
		 * muestra el resultado. La suma total se puede dividir entre la cantidad de
		 * elementos del array.
		 */
		float[] arr = new float[6];
		Scanner read = new Scanner(System.in);
		float suma = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Ingrese número " + (i + 1) + ":");
			arr[i] = read.nextFloat();
			suma = suma + arr[i];
		}
		float promedio = suma / arr.length;

		System.out.println("El promedio es: " + promedio);

	}
}
