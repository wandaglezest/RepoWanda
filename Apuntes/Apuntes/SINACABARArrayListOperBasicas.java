package Apuntes;

import java.util.ArrayList;
import java.util.Scanner;

public class SINACABARArrayListOperBasicas {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que: 1. Cree un ArrayList de cadenas (String). 2. Permita
		 * al usuario agregar nombres al ArrayList hasta que ingrese la palabra "fin".
		 * 3. Después de eso, imprima todos los nombres ingresados. 4. Permita al
		 * usuario eliminar un nombre específico y vuelva a mostrar la lista
		 * actualizada.
		 */
		// falta que el programa deje de eliminar cuando se escriba 'fin'

		ArrayList<String> a = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		String b;
		String siono = "";
		int posicion;

		System.out.println("Introduce las palabras y escribe 'fin' para terminar de introducir.");
		while (true) {
			b = read.next();
			if (b.equalsIgnoreCase("fin")) {
				break;
			}
			a.add(b);
		}
		System.out.println(a);
		System.out.println("¿Quiere eliminar alguna palabra?");
		while (true) {
			siono.equals("si");
			if (siono.equalsIgnoreCase("no")) {
				break;
			}

			System.out.println("Indique el nº de posición de la palabra a eliminar (empezando por el 0): ");
			posicion = read.nextInt();
			a.remove(posicion);
			System.out.println("El array queda así: .Ponga otra posisión a borrar o esbriba 'fin?");
			System.out.println(a);
		}

		read.close();
	}

}
