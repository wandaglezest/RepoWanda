package Apuntes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej5 {
	public static void main (String [] args) {
	
	/*Declara una variable para el radio de un círculo. Utiliza la fórmula Perímetro = 2 * π * radio para calcular
	 *  el perímetro del círculo e imprimirlo en la consola. Usa Math.PI para obtener el valor de π.
	 */
	System.out.println("Dame el radio de un círculo para obtener el perímetro.");
	Scanner scanner= new Scanner (System.in);

	double radio = scanner.nextDouble();
	double perimetro = (radio * 2 * Math.PI);
	
	
	System.out.println("El perímetro de un círculo con radio " + radio + ", es " + (double)Math.round(perimetro * 100d) / 100d);
	}

}
