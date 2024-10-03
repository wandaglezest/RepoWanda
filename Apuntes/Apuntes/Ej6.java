package Apuntes;

public class Ej6 {
	public static void main (String [] args) {
		/*Declara dos variables enteras con diferentes valores. Intercambia sus valores sin usar una tercera variable temporal e imprime los resultados 
		antes y después del intercambio.*/
	
		int a = 5;
		int b = 10;
		System.out.println("La primera número a es "+ a + " y la número es "+ b);
		System.out.println(a = a+b);
		System.out.println(b = a-b);
		System.out.println(a = a-b);
		
		System.out.println("a se ha covertido en " + a);
		System.out.println("b se ha covertido en " + b);
		
		
 }
}
