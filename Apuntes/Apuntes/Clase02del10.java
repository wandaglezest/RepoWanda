package Apuntes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Clase02del10 {

	public static void main(String[] args) throws IOException {

			/*
			 *
			 * Comentarios en Java
				Variables en Java.
			
				Literales
			
			Palabra reservada final
			
			Secuencias de escape
			
			Identificadores
			
			Tipos de datos
			
			Operadores.
			
			Estructuras de control.
			
			Arrays y cadenas en Java*/
			
			//COMENTARIOS
			/*comentarios*/
			
			//VARIABLES
//			String cadena = "cadena";
			int numero1 = 4;
			int numero2 = 9;
			boolean estaAtendiendo = true;
			
			int [] array = new int [10];
			
			//OPERADORES
			//&& -->Y
			// || OR
			
			//ESTRUCTURAS DE CONSystem.out.print("hola");TROL
			/*IFS
			 *
			 * SWITCH
			 *
			 * FOR
			 *
			 * WHILE
			 *
			 * O WHILE*/
			
			//IF
			if(numero1 > numero2 ) {
				System.out.println("IMprime una lineaa");
				System.out.println("hola");
				System.out.println("estoiy");
				System.out.println("pegado");
				
			}else {
				System.out.println("numero2 > numero1");
			}
			
//			if(numero2 > numero1 )
//				System.out.println("numero2 > numero1");
//			
//			if(numero1 == 0 && numero1 < numero2) {
//				
//			}else {
//				if(numero1 == 0 || numero1 < numero2) {
//					System.out.println("numero2 > numero1");
//				}
//			}
			
			
			
			String cadena = "asdjkhasdkjh";
			
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			
//			System.out.println("Introduce una cadena por teclado :"+leer.readLine());
			
//			cadena = leer.readLine();
			
			
			switch (cadena) {
			case "dam": {
				System.out.println("NUmero vale 1");
				break;
			}
			case "prog": {
				System.out.println("NUmero vale 1");
				break;
			}
			default:
				System.out.println("Unexpected value: "+cadena);
			}
			
			//Parseos
			Integer.par
			
			//LEER POR PANTALLA
			import java.util.Scanner;
			public class LeerPorPantalla {
			    public static void main(String[] args) {
			        // Crear un objeto Scanner para leer datos de la entrada estándar (teclado)
			        Scanner scanner = new Scanner(System.in);
			        // Pedir al usuario que ingrese un texto
			        System.out.print("Introduce un texto: ");
			        String texto = scanner.nextLine();  // Lee una línea completa de texto
			        // Mostrar el texto ingresado
			        System.out.println("Texto ingresado: " + texto);
			        // Cerrar el escáner
			        scanner.close();
			    }
			}
			
		}
}
