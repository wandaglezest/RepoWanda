package Apuntes.Arrays;

public class ArraysRotacionArray {

	public static void main(String[] args) {

		/*
		 * Crea un array de 5 números y rota sus elementos una posición a la derecha.
		 * Por ejemplo, si el array es [1, 2, 3, 4, 5], el resultado debe ser [5, 1, 2,
		 * 3, 4]. Pista: Almacena el último elemento y mueve todos los demás elementos
		 * una posición hacia la derecha.
		 */
		int[] numeros = { 1, 2, 3, 4, 5 };

		System.out.println("El array es:");
		MostrarArray(numeros);
		RotarArray(numeros);

		System.out.println("\nEl array invertido es:");
		MostrarArray(numeros);
	}

	public static void RotarArray(int[] array) {

		int ultposicion = array[array.length - 1];

		int[] invertido = new int[array.length];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = ultposicion;
	}

	public static void MostrarArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
