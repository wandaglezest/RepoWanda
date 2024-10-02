package Apuntes1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase1 {
 
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
//		String cadena = "cadena";
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
		
//		if(numero2 > numero1 )
//			System.out.println("numero2 > numero1");
//		
//		if(numero1 == 0 && numero1 < numero2) {
//			
//		}else {
//			if(numero1 == 0 || numero1 < numero2) {
//				System.out.println("numero2 > numero1");
//			}
//		}
		
		
		
		String cadena = "asdjkhasdkjh";
		
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Introduce una cadena por teclado :"+leer.readLine());
		
//		cadena = leer.readLine();
		
		
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
		
		
	}
}
