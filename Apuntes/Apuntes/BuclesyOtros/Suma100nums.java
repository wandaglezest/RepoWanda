package Apuntes.BuclesyOtros;

public class Suma100nums {
	public static void main (String[]ars) {
		
		/*Escribe un programa que utilice un bucle para sumar los números enteros del 1 al 100 y luego imprima el resultado.
		 */
		int suma = 0;
		
		for (int sumacien = 1; sumacien <= 100; sumacien++) {
			System.out.println (suma + " + " + sumacien);
			suma = suma + sumacien;
			}
		System.out.println ("El resultado es " + suma);
	}
	

}
