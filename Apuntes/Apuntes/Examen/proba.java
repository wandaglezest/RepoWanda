package Apuntes.Examen;

public class proba {
	public static void main(String[] args) {

		int[] arreglo = { 3, 7, 2, 8, 4 };
		System.out.println(
				"El mínimo del arreglo es: " + calcularMaximo(arreglo) + " y el mínimo es: " + calcularMinimo(arreglo));

	}

	public static int calcularMaximo(int[] arreglo) {
		int maximo = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > maximo) {
				maximo = arreglo[i];
			}
		}
		return maximo;
	}

	public static int calcularMinimo(int[] arreglo) {
		int minimo = arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < minimo) {
				minimo = arreglo[i];
			}
		}
		return minimo;
	}
}