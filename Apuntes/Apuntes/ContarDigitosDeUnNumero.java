package Apuntes;

import java.util.Scanner;

public class ContarDigitosDeUnNumero {
	public static void main (String[]args) {
		
		/*Escribe un programa que pida un número entero positivo y cuente cuántos dígitos tiene. 
		 * Por ejemplo, si el número es 12345, debe imprimir que tiene 5 dígitos.
		 */
		System.out.println("Dame un número.");
		Scanner leer = new Scanner (System.in);
		int numero1 = leer.nextInt();
		
		System.out.println("El número " + numero1 + " tiene " + Integer.toString(numero1).length() + " cifras.");
	}

}
