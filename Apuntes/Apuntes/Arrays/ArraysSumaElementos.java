package Apuntes.Arrays;

public class ArraysSumaElementos {

	public static void main(String[] args) {
		int[] cinco = new int[5];
		/*
		 * Crea un array de 5 números enteros. Calcula la suma de todos los elementos y
		 * muestra el resultado. Puedes usar un bucle para iterar sobre el array y sumar
		 * los elementos.
		 */

		// Asignar valores automáticamente del 1 al 5
		for (int i = 0; i < cinco.length; i++) {
			cinco[i] = i + 1; // Asignar i + 1 para que los valores sean del 1 al 5
		}

		int suma = 0;

		for (int i = 0; i < cinco.length; i++) {
			int numeros = i + 1;
			System.out.println("La posición del Array es: " + i + " y el número es: " + numeros);
			suma += cinco[i];
		}
		System.out.println("La suma es " + suma);

	}

}
