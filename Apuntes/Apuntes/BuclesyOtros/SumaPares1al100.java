package Apuntes.BuclesyOtros;

public class SumaPares1al100 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que utilice un bucle para sumar todos los números pares
		 * entre 1 y 100 y luego imprima el resultado.
		 * 
		 */
		int suma = 0;

		for (int sumacien = 2; sumacien <= 100; sumacien += 2) {
			System.out.println(suma + " + " + sumacien);
			suma = suma + sumacien;
		}
		System.out.println("El resultado es " + suma + ".");

	}

}
