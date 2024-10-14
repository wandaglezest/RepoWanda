package Apuntes;

import java.util.Scanner;

public class InvertirNumero {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Dame num");
		String numero = leer.next();
		String revertido = "";

		for (int i = numero.length() - 1; i > -1; i--) {
			revertido = revertido + numero.charAt(i);

		}
		System.out.println(revertido);

	}
}
