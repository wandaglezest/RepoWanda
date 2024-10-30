package Apuntes.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListActualizacionDeaElementos {

	public static void main(String[] args) {

		/*
		 * 1. Cree un ArrayList de enteros con 10 elementos. 2. Permita al usuario
		 * actualizar el valor de un elemento en una posición específica (usando su
		 * índice). 3. Después de cada actualización, imprime el ArrayList actualizado.
		 */
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		IntroducirNumeros(nums, read);
		CambiarNumeroConIndex(nums, read);
		read.close();

	}

	private static void CambiarNumeroConIndex(ArrayList<Integer> nums, Scanner read) {
		String siono;
		int index;
		int cambionum;
		System.out.println("Números introducidos: " + nums + ". ¿Desea cambiar alguno?(indique 'si' o 'no')");
		while (true) {
			siono = read.next();
			if (siono.equalsIgnoreCase("no")) {
				break;
			} else if (siono.equalsIgnoreCase("si")) {
				System.out.println("Indique el número de la posición(empezando por el 0).");
				index = read.nextInt();
				System.out.println("Indique el número por el que lo quiere cambiar.");
				cambionum = read.nextInt();
				nums.set(index, cambionum);
				System.out.println(
						"La lista se ha actualizado: " + nums + ".¿Desea cambiar otro número?(indique 'si' o 'no')\"");
			}
		}
	}

	private static void IntroducirNumeros(ArrayList<Integer> nums, Scanner read) {
		System.out.println("Introduce 10 números:");
		for (int i = 0; i < 10; i++) {
			int numeros = read.nextInt();
			nums.add(numeros);
		}
	}

}
