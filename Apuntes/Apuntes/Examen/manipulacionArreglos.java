package Apuntes.Examen;

public class manipulacionArreglos {

	public static void main(String[] args) {
		int[] arreglo = { 3, 7, 2, 8, 4 };
		encontrarMaximoMinimo(arreglo);
	}

	public static void encontrarMaximoMinimo(int[] arreglo) {

		int minimo = arreglo[0];
		int maximo = arreglo[0];

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < minimo) {
				minimo = arreglo[i];
			}
			if (arreglo[i] > maximo) {
				maximo = arreglo[i];
			}
		}
		System.out.println("El máximo es: " + maximo);
		System.out.println("El mínimo es: " + minimo);
	}
}
