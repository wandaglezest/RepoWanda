package Apuntes.BuclesyOtros;

import java.util.Scanner;

public class TablaDeMultiplicar {
	public static void main (String[]args) {
		/*Escribe un programa que reciba un número entero e imprima su tabla de multiplicar del 1 al 10. Por ejemplo, si el número es 5, debe imprimir:
5 x 1 = 5,5 x 2 = 10,...,5 x 10 = 50...*/
 
		System.out.println("Dame un número para obtener su tabla de multiplicar.");
		Scanner leer = new Scanner (System.in);
		
		int numerodado = leer.nextInt();
		
		for (int multiplicador = 0; multiplicador <= 10; multiplicador++ ) {
			int i = multiplicador * numerodado;
			System.out.println(numerodado + " * "+ multiplicador + " es igual a "+ i);
			
			
		}
		
		
	}

}
