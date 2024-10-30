package Apuntes.Arrays;

public class ArrayMultidimensionalMayorSuma {
	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int indiceFilaMaxima = filaConSumaMaxima(matriz);
		System.out.println("La fila con la suma más alta es la " + (indiceFilaMaxima + 1) + "ª fila.");
	}

	public static int filaConSumaMaxima(int[][] matriz) {
		int indiceMaximo = 0;
		int sumaMaxima = 0;

		for (int i = 0; i < matriz.length; i++) {
			int sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
			}
			if (sumaFila > sumaMaxima) {
				sumaMaxima = sumaFila;
				indiceMaximo = i;
			}
		}

		return indiceMaximo;
	}
}