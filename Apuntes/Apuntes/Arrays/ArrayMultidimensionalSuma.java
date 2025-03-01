package Apuntes.Arrays;

public class ArrayMultidimensionalSuma {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int suma = sumaElementos(matriz);
		System.out.println("La suma de los elementos de la matriz es: " + suma);
	}

	public static int sumaElementos(int[][] matriz) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}
}
