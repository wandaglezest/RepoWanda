package Apuntes.BuclesyOtros;

import java.util.Scanner;

public class CalculoIVA {

	public static void main(String[] args) {

		/*
		 * Declara una variable para el precio de un producto y otra para el porcentaje
		 * de IVA (por ejemplo, 21%). Calcula el precio final incluyendo el IVA e
		 * imprime el resultado.
		 */

		System.out.println("Dame un precio al que calcular su IVA:");
		Scanner read = new Scanner(System.in);
		int precio = read.nextInt();
		int iva = 0;

		iva = precio * 21 / 100;

		System.out.println("El IVA de " + precio + "€ es " + iva + "€. El precio + IVA sería: " + (precio + iva) + "€");

	}

}
