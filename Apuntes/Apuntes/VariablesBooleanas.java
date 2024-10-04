package Apuntes;

public class VariablesBooleanas {
 public static void main (String[]args) {
	 
	 /*Declara dos variables booleanas, una con el valor true y otra con false. 
	  * Imprime los resultados de aplicar las operaciones lógicas AND, OR y NOT a estas variables.
	  */
	
			boolean a = true;
			boolean b = false;
			
			// Operaciones lógicas
			 boolean andResultado = a && b; // AND
			 boolean orResultado = a || b; // OR
			 boolean notA = !a; // NOT a
			 boolean notB = !b; // NOT b
			
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("Resultado de a AND b: " + andResultado);
		    System.out.println("Resultado de a OR b: " + orResultado);
		    System.out.println("Resultado de NOT a: " + notA);
		    System.out.println("Resultado de NOT b: " + notB);
		}
		}







