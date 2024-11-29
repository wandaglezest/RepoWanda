package Apuntes.explicacionPOO;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Películas(Pulse 1) / Series(Pulse 2) / Temporadas(Pulse 3) / Capítulos(Pulse 4) .");
		int numero = read.nextInt();
		switch (numero) {
		case 1: {
			System.out.println("Introcude el nombre de la película:");
			String nombrePel = read.next();
			System.out.println("Introcude el género de la película:");
			String generoPel = read.next();
			System.out.println("Introcude el año de la película:");
			int anioPel = read.nextInt();
			System.out.println("Introcude la duración de la película:");
			int duracionPel = read.nextInt();

			// Peliculas Titanic = new Peliculas("Titanic", "Romance", 1997, 194);
			Peliculas Titanic = new Peliculas(nombrePel, generoPel, anioPel, duracionPel);

			System.out.println(Titanic.getGeneroPel());
			break;

		}
		case 2: {
			System.out.println("Introcude el nombre de la serie:");
			String nombreSer = read.next();
			System.out.println("Introcude el género de la serie:");
			String generoSer = read.next();
			System.out.println("Introcude el número de temporadas:");
			int temporadasSer = read.nextInt();

			Series Friends = new Series(nombreSer, generoSer, temporadasSer);

			System.out.println(Friends.getGeneroSer());
			break;

		}
		case 3: {
			System.out.println("Introcude el número de la temporada:");
			int numTemp = read.nextInt();
			System.out.println("Introcude el número de capítulos:");
			int capitulosTemp = read.nextInt();

			Temporadas temp1 = new Temporadas(numTemp, capitulosTemp);

			System.out.println(temp1.getCapitulosTemp());
			break;

		}
		case 4: {
			System.out.println("Introcude el número de capítulo:");
			int numCap = read.nextInt();
			System.out.println("Introcude la duración del capítulo:");
			int duracionCap = read.nextInt();

			Capitulos cap20 = new Capitulos(numCap, duracionCap);

			System.out.println(cap20.getNumCap());
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + numero);
		}
		read.close();
	}

}
