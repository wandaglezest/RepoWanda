package Apuntes.Examen;

public class DebbugingenJava {
	public static void main(String[] args) {
		int[] arreglo = { 4, 8, 15, 16 };
		int valor = 16;
		int posicion = encontrarIndice(arreglo, valor);

		System.out.println("La posición del valor es: " + posicion);

	}

	public static int encontrarIndice(int[] arreglo, int valor) {

		int posicion = -1;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == valor) {
				posicion = i;
			}
		}
		return posicion;
	}
}
