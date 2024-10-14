package Apuntes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.Utilidades.Utilidades;
public class PREGUNTARLeerPorTeclado {
	public static void main(String[] args) {
		System.out.println("Numero aleatorio: " + Utilidades.generarNUmeroAletorioEntero());
		String cadena = "Primitivo Morena";
		String izan = cadena.substring(3);
		System.out.println("Subcadena: " + izan);
		izan = cadena.replace('i', 'o');
		System.out.println("subcadena: " + izan);
		String[] array = izan.split(" ");
		for (String c : array) {
			System.out.println("Cadena :" + c);
		}
		izan.length();
		if (izan.isBlank() || izan.isEmpty()) {
		}
		if (Utilidades.esPrimo(0)) {
		}
		List<Integer> lista = new ArrayList<>();
		lista.add(45);// 0
		lista.add(34);// 1
		lista.add(4);// 2
		Collections.sort(lista);
		Collections.reverseOrder();
		// for each
		System.out.println("");
		System.out.println("for each: ");
		for (int jhasgdasgd : lista) {
			System.out.println("Los numero ordenados son: ");
			System.out.println(jhasgdasgd);
		}
		// for
		System.out.println("");
		System.out.println("for : ");
		for (int j = 0; j <= lista.size(); j++) {
			System.out.println("Los numero ordenados son: ");
			System.out.println(lista.get(j));
		}
	}
}