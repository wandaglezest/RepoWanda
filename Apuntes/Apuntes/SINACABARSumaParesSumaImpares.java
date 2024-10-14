package Apuntes;

public class SINACABARSumaParesSumaImpares {
	public static void main(String[] args) {
		// PONER SCANNER PARA RECOGER NÚMERO
		int[] pares = new int[475];
		int[] impares = new int[798];
		int sumaPares = 0;
		int sumaImpares = 0;
		int indicePares = 0;
		int indiceImpares = 0;

		for (int i = 0; i <= 1333; i++) {
			// System.out.println(i);

			if (i % 2 == 0 && i <= 475) {
				sumaPares += i;
				pares[indicePares] = i;
				indicePares++;
			} else if (i % 2 == 1 && i <= 798) {
				sumaImpares += i;
				impares[indiceImpares] = i;
				indiceImpares++;
			}
		}

		for (int i = 0; i < 475; i++) {
			System.out.println(pares[i]);
		}

		for (int i = 0; i < 475; i++) {
			System.out.println(impares[i]);
		}
		int Total = sumaPares + sumaImpares;
		System.out.println("La suma de todos los pares es: " + sumaPares + " y la suma de todos los impares es: "
				+ sumaImpares + " y si los sumamos:  " + Total);
	}

}
