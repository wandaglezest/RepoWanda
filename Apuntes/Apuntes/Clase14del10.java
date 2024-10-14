package Apuntes;

public class Clase14del10 {

	public static void main(String[] args) {
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = i + 1;

		}

		// for (si tiene condicion inicial y final y se va iterando de uno en un uno o
		// de dos en dos o incluso negativamente)
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(i);

		}

		// for each (no hace falta condicion inicial y final y se va iterando de uno en
		// un uno)
		for (int i : numeros) {

			System.out.println(i);

		}

	}

}
