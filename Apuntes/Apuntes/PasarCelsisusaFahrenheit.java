package Apuntes;

import java.util.Scanner;

public class PasarCelsisusaFahrenheit {
	public static void main (String []args) {
		/*Declara una variable para una temperatura en grados Celsius. 
		 * Convierte esta temperatura a Fahrenheit utilizando la fórmula 
		 * F = (C * 9/5) + 32 e imprime el resultado.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame una temperatura en grados Celsius.");
		double gradoscelsius = sc.nextDouble();
		double gradosfarenheit = (gradoscelsius * 9/5) + 32;
		System.out.println(gradoscelsius + "º" + "  en grados Fahrenheit es "+ gradosfarenheit + "º");
		
	}

}
