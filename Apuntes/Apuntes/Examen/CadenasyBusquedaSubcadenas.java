package Apuntes.Examen;

public class CadenasyBusquedaSubcadenas {

	public static void main(String[] args) {

		String cadena = "abra";
		String cadenaCompleta = "abracadabrapatadecabra";

		// podemos usar .contains para saber si la cadena existe dentro de la otra

		if (cadenaCompleta.contains(cadena)) {
			System.out.println(cadena + " sí está en la cadena.");
		} else {
			System.out.println(cadena + " no está en la cadena.");
		}

		int index = cadenaCompleta.indexOf(cadena);

		System.out.println("El índice " + index);

		int contador = 0;

		while (index != -1) {
			contador++;
			index = cadenaCompleta.indexOf(cadena, index + 1);
		}

		System.out.println(cadena + " aparece " + contador + " veces.");
	}
}
