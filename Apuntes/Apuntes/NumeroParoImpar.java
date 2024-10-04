package Apuntes;

import java.util.Scanner;

public class NumeroParoImpar {
	public static void main (String[]args) {
		
		
		//* Crear un objeto Scanner para leer datos de la entrada estándar (teclado)
        //Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese un texto
        //System.out.print("Introduce un texto: ");
        //String texto = scanner.nextLine();  // Lee una línea completa de texto
        // Mostrar el texto ingresado
        //System.out.println("Texto ingresado: " + texto);
        // Cerrar el escáner
        //scanner.close();
		
		
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in);
		int numdado = leer.nextInt();
		
		
		if (numdado % 2 == 0) {
			System.out.println ("Es par.");
			
		} else { 
			System.out.println ("Es impar.")
;
		}
		
	}
	

}
