package Apuntes.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperBasicas {

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
		int siono3;

		System.out.println("Introduce las palabras y escribe 'fin' para terminar de introducir.");
		while (true) {
			b = read.next();
			if (b.equalsIgnoreCase("fin")) {
				break;
			}
			a.add(b);
		}
		System.out.println(a);

		while (true) {
			System.out.println("¿Quiere eliminar alguna palabra? ('si' para continuar, 'fin' para terminar)");
			siono = read.next();
			if (siono.equalsIgnoreCase("fin")) {
				break;
			}

			else if (siono.equalsIgnoreCase("si")) {
				System.out.println("Indique el número de la posición(empezando por el 0)");
				siono3 = read.nextInt();

				if (siono3 >= 0 && siono3 < a.size()) {
					a.remove(siono3);
					System.out.println("El array queda así: " + a);
				} else {
					System.out.println("Posición no válida");
				}
			} else {
				System.out.println("Escribe 'si' o 'fin'");
			}

		}

		read.close();
	}

}
