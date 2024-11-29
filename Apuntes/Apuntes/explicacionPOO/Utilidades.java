package Apuntes.explicacionPOO;

import java.util.Scanner;

public class Utilidades {

	public static void mostrarMensaje() {

		System.out.println("EN ESTE METODO VAMOS A MOSTRAR UN UNMERO POR PANTALLA");

		Scanner leer = new Scanner(System.in);

		System.out.println("Introdue unnumero por teclado");

		String cadena = leer.nextLine();

		System.out.println("Vamos a imprimir por pantalla");

	}

	public static void calcularNumeroPrimo() {

		System.out.println("EN ESTE METODO VAMOS A CALCULAR SI UN UNMERO ES PRIMO");
		// vamos a calcular si unnumero es primo
		Scanner leer = new Scanner(System.in);

		System.out.println("Introdue unnumero por teclado y calcularemos si es primo");

		int numero = leer.nextInt();

		int contador = 0;

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				contador++;
			}

		}

		if (contador == 2) {// esPrimo
			System.out.println("El numero " + numero + " es Primo");

		}

	}

	private String numBastidor;
	private String matricula;
	private String modelo;
	private String marca;

	public Utilidades() {
	}

	public Utilidades(String mat) {
		this.matricula = mat;
	}

	public Utilidades(String basti, String matric, String mod, String marca) {
		this.numBastidor = basti;
		this.matricula = matric;
		this.modelo = mod;
		this.marca = marca;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String string) {
		// TODO Auto-generated method stub

	}

}