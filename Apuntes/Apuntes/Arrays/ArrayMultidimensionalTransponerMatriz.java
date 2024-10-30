package Apuntes.Arrays;

public class ArrayMultidimensionalTransponerMatriz {
	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matrizTranspuesta = transponerMatriz(matriz);

		// Imprimir la matriz transpuesta
		System.out.println("Matriz transpuesta:");
		for (int i = 0; i < matrizTranspuesta.length; i++) {
			for (int j = 0; j < matrizTranspuesta[i].length; j++) {
				System.out.print(matrizTranspuesta[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] transponerMatriz(int[][] matriz) {
		int m = matriz.length; // Número de filas
		int n = matriz[0].length; // Número de columnas
		int[][] transpuesta = new int[n][m]; // Nueva matriz transpuesta

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				transpuesta[j][i] = matriz[i][j]; // Intercambio de filas por columnas
			}
		}

		return transpuesta;
	}
}
