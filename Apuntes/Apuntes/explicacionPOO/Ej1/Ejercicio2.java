package Apuntes.explicacionPOO.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

import Apuntes.explicacionPOO.Ej2.Cancion;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Cancion> canciones = new ArrayList<Cancion>();

		Scanner read = new Scanner(System.in);

		System.out.println("Escribe el nombre de la canción");
		String nombreCancion = read.next();
		System.out.println("Escribe el grupo de la canción");
		String grupoCancion = read.next();
		System.out.println("Escribe el año de la canción");
		int anioCancion = read.nextInt();

		Cancion cancion1 = new Cancion(nombreCancion, grupoCancion, anioCancion);

		int salir = 1;
		while (salir == 1) {
			Cancion c = new Cancion();
			cancion.setNombre();
			canciones.add(cancion);

		}
	}

}
