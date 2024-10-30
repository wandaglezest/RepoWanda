package Apuntes.BuclesyOtros;

import java.util.Scanner;

public class MayorDeTres {
	public static void main (String[]args){
		
		/*Escribe un programa que lea tres números enteros e imprima cuál de ellos es el mayor. 
		 * Si todos son iguales, imprime un mensaje indicándolo.
		 */
		
		
	Scanner leer = new Scanner(System.in);
	
	System.out.print("Dime el primer número: ");
	int numero1 = leer.nextInt();
	System.out.print("Dime el segundo número: ");
	int numero2 = leer.nextInt();
	System.out.print("Dime el tercer número: ");
	int numero3 = leer.nextInt();
	
	int numeromayor = numero1;
	if (numero2 > numeromayor) {
		numeromayor = numero2;
		
	} 
	if (numero3 > numeromayor) {
		numeromayor = numero3;
		
	} 
	
	System.out.print("El número mayor de los tres es: " + numeromayor);

	}

}
