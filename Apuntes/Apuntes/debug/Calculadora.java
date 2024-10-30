package Apuntes.debug;

public class Calculadora {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			System.out.println("Suma: " + sumar(a, b));
			System.out.println("Resta: " + restar(a, b));
			System.out.println("Multiplicación: " + multiplicar(a, b));
			System.out.println("División: " + dividir(a, b));

		} catch (ArithmeticException e) {
			System.out.println("Error al dividir por 0. " + e.toString());
		}

	}

	public static int sumar(int x, int y) {
		return x + y;
	}

	public static int restar(int x, int y) {
		return x - y;
	}

	public static int multiplicar(int x, int y) {
		// Error intencional: Debe devolver x * y
		return x + y;
	}

	public static int dividir(int x, int y) {
		// Error: posible división por cero
		return x / y;
	}
}
