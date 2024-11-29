package Apuntes.Examen;

import java.util.Scanner;

public class calcularSumaHastaN {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero = read.nextInt();

		int suma = 0;
		suma = calcularSumaHastaN(numero);
	}

	public static int calcularSumaHastaN(int numero) {
		int suma = 0;

		for (int i = 1; i <= numero; i++) {
			suma += i;
		}

		System.out.println(suma);
		return suma;
	}

}
